import { AgGridReact } from "ag-grid-react";
import { useEffect, useState } from "react";
import { Button } from "react-bootstrap";
import "ag-grid-community/styles/ag-grid.css"; // Mandatory CSS required by the grid
import "ag-grid-community/styles/ag-theme-quartz.css"; // Optional Theme applied to the grid
import "./subdepartment.css"
import { useNavigate } from "react-router-dom";
import { fetchSubDepartment } from "../Api/ApiManager";

function SubDepartment() {
  const navigate = useNavigate()
  const [rowData, setRowData] = useState([]);
  
  // Column Definitions: Defines the columns to be displayed.
  const [colDefs, setColDefs] = useState([
    { field: "subDepartmentName" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "departmentName" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "createdBy" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "createdOn" ,flex: 1, cellStyle: { 'textAlign': 'left' }}
  ]);

  useEffect(()=>{
    fetchSubDepartment().
    then((data)=>{
      createRowData(data)
    })
  },[])
  function createRowData(data){
    let tempArr = [];
    data.map((row)=>{
      console.log(row)
      tempArr.push({
        subDepartmentName: row.subDepartmentName,
        departmentName: row.department.departmentName,
        createdBy: row.whoCreated,
        createdOn: row.whenCreated,
      })
    })
    setRowData(tempArr);
  }
  function clickHandler(url){
    navigate(url);
}
  return (
    <>
      
          <Button 
            className="float-start createButton" 
            onClick={() => {clickHandler("/subdepartment/create")}}>
          Add Sub Department
          </Button>
        <div
          className="ag-theme-quartz gridMargin" // applying the grid theme
          style={{ height: 500 }} // the grid will fill the size of the parent container
        >
          <AgGridReact
              rowData={rowData}
              columnDefs={colDefs}
          />
        </div>
      
        
    </>
  );
}

export default SubDepartment;
