import { AgGridReact } from "ag-grid-react";
import { useEffect, useState } from "react";
import { Button } from "react-bootstrap";
import "ag-grid-community/styles/ag-grid.css"; // Mandatory CSS required by the grid
import "ag-grid-community/styles/ag-theme-quartz.css"; // Optional Theme applied to the grid
import "./employee.css"
import { useNavigate } from "react-router-dom";
import { fetchAllEmployee, fetchTrainingDetails } from "../Api/ApiManager";

function Employee() {
  const navigate = useNavigate()
  const [rowData, setRowData] = useState([]);

  useEffect(()=>{
    fetchAllEmployee().
    then((data)=>{
      console.log(data)
      createRowData(data)
    })
  },[])

  function createRowData(data){
    let tempArr = [];
    data.map((row)=>{
      console.log(row)
      tempArr.push({
        employeeName: row.employeeName,
        employeeCode: row.employeeCode,
        department: row.department.departmentName,
        subDepartment: row.subDepartment.subDepartmentName,
        gender: row.gender,
        email: row.email,
        dob: row.dob
      })
    })
    setRowData(tempArr);
  }
  
  // Column Definitions: Defines the columns to be displayed.
  const [colDefs, setColDefs] = useState([
    { field: "employeeName" ,flex: 1, cellStyle: { 'text-align': 'left' }},
    { field: "employeeCode" ,flex: 1, cellStyle: { 'text-align': 'left' }},
    { field: "department" ,flex: 1, cellStyle: { 'text-align': 'left' }},
    { field: "subDepartment" ,flex: 1, cellStyle: { 'text-align': 'left' }},
    { field: "gender" ,flex: 1, cellStyle: { 'text-align': 'left' }},
    { field: "email" ,flex: 1, cellStyle: { 'text-align': 'left' }},
    { field: "dob" ,flex: 1, cellStyle: { 'text-align': 'left' }}
  ]);
  function clickHandler(url){
    navigate(url);
}
  return (
    <>
      
          <Button className="float-start createButton" onClick={() => {clickHandler("/employee/create")}}>
          Register Employee
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

export default Employee;
