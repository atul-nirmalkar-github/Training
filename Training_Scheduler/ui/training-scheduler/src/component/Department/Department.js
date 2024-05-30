import { AgGridReact } from "ag-grid-react";
import { useEffect, useState } from "react";
import { Button } from "react-bootstrap";
import "ag-grid-community/styles/ag-grid.css"; // Mandatory CSS required by the grid
import "ag-grid-community/styles/ag-theme-quartz.css"; // Optional Theme applied to the grid
import "./department.css"
import { useNavigate } from "react-router-dom";
import { deleteDepartment, fetchDepartment, fetchDepartmentByStatus } from "../Api/ApiManager";
import Company from "../Company/Company";

function Department() {
  const navigate = useNavigate()
  const [rowData, setRowData] = useState([]);
  const [departmentList, setDepartmentList] = useState([]);
  
  // Column Definitions: Defines the columns to be displayed.
  const [colDefs, setColDefs] = useState([
    { field: "id" , hide: true, flex: 1, cellStyle: { 'textAlign': 'left' }},
    { 
      field: "departmentName" ,
      flex: 1, 
      cellStyle: { 'textAlign': 'left' },
      headerCheckboxSelection: true,
      checkboxSelection: true,
      showDisabledCheckboxes: true
    },
    { field: "departmentCode" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "company" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "createdBy" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "createdOn" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    {  field: 'edit',flex:1,
        cellRenderer : function(params){
            function navigateToEdit(params){
              navigate('/department/'+params.data.id)
            }
            return <Button onClick={()=>{navigateToEdit(params)}}>Edit</Button>
        }
    }
  ]);

  useEffect(()=>{
    loadDepartment()
    
  },[])
  function loadDepartment(){
    fetchDepartmentByStatus("ACTIVE").
    then((data)=>{
      createRowData(data)
    })
  }
  function createRowData(data){
    let tempArr = [];
    data.map((row)=>{
      tempArr.push({
        id:row.departmentKey,
        departmentName: row.deptName,
        departmentCode: row.deptCode,
        company: row.trainingCompany.name,
        createdBy: row.whoCreated,
        createdOn: row.whenCreated,
      })
    })
    setRowData(tempArr);
  }
  function clickHandler(url){
    navigate(url);
  }
  function addDepartmentList(event){
    var tempArr = [];
    event.api.getSelectedRows().map((row)=>{
      tempArr.push(row['id']);
    })
    setDepartmentList(tempArr);
  }
  function removeHandler(event){
    let header = {
      ids: departmentList
    }
    deleteDepartment(header).
      then((response)=>{
        loadDepartment()
      });
      event.preventDefault();
  }
  return (
    <>
      <div style={{width:'100%'}}>
          <Button className="float-start createButton" onClick={() => {clickHandler("/department/create")}}>
          Add Department
          </Button>
          <Button className="float-start createButton" onClick={removeHandler}>
              Remove Department
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
              onSelectionChanged={addDepartmentList}
              suppressRowClickSelection={true}
          />
        </div>
      </div>
        
    </>
  );
}

export default Department;
