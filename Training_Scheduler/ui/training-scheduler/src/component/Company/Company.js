import { AgGridReact } from "ag-grid-react";
import { useEffect, useState } from "react";
import { Button } from "react-bootstrap";
import "ag-grid-community/styles/ag-grid.css"; // Mandatory CSS required by the grid
import "ag-grid-community/styles/ag-theme-quartz.css"; // Optional Theme applied to the grid
import "./company.css"
import { useNavigate } from "react-router-dom";
import { deleteCompany, fetchCompany, fetchCompanyByStatus, fetchDepartment } from "../Api/ApiManager";

function Company() {
  const navigate = useNavigate()
  const [rowData, setRowData] = useState([]);
  const [companyList, setCompanyList] = useState([]);
  // Column Definitions: Defines the columns to be displayed.
  const [colDefs, setColDefs] = useState([
    { field: "id" , hide: true, flex: 1, cellStyle: { 'textAlign': 'left' }},
    { 
      field: "companyName" ,
      flex: 1, 
      cellStyle: { 'textAlign': 'left'} ,
      headerCheckboxSelection: true,
      checkboxSelection: true,
      showDisabledCheckboxes: true
    },
    { field: "companyPhone" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "contactName" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "contactPhone" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "companyAddress" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "deviceCount" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "employeeCount" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "userCount" ,flex: 1, cellStyle: { 'textAlign': 'left' }}
  ]);

  useEffect(()=>{
    fetchCompanyList()
  },[])
  function fetchCompanyList(){
    fetchCompanyByStatus("ACTIVE").
    then((data)=>{
      createRowData(data)
    })
  }
  function createRowData(data){
    let tempArr = [];
    data.map((row)=>{
      tempArr.push({
        id: row.id,
        companyName: row.name,
        companyPhone: row.companyPhone,
        contactName: row.contactName,
        contactPhone: row.contactPhone,
        companyAddress: row.companyAddress,
        deviceCount: row.maxDevicesLimit,
        employeeCount: row.maxEmployeesLimit,
        userCount: row.maxEmployeesLimit,
      })
    })
    setRowData(tempArr);
  }
  function clickHandler(url){
    navigate(url);
  }
  function removeHandler(event){
    let header = {
      ids: companyList
    }
    deleteCompany(header).
      then((response)=>{
        fetchCompanyList()
      });
      event.preventDefault();
  }
  function addCompanyList(event){
    var tempArr = [];
    event.api.getSelectedRows().map((row)=>{
      tempArr.push(row['id']);
    })
    setCompanyList(tempArr);
  }
  return (
    <>
      
      <div style={{width:'100%'}}>
          <Button className="float-start createButton" onClick={() => {clickHandler("/company/create")}}>
              Add Company
          </Button>
          <Button className="float-start createButton" onClick={removeHandler}>
              Remove Company
          </Button>
          <div
            className="ag-theme-quartz gridMargin" // applying the grid theme
            style={{ height: 500 }} // the grid will fill the size of the parent container
          >
            <AgGridReact
                rowData={rowData}
                columnDefs={colDefs}
                rowSelection="multiple"
                rowMultiSelectWithClick={true}
                onSelectionChanged={addCompanyList}
                suppressRowClickSelection={true}
            />
          </div>
  
        </div>
      
        
    </>
  );
}

export default Company;
