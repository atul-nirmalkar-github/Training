import { AgGridReact } from "ag-grid-react";
import { useEffect, useState } from "react";
import { Button } from "react-bootstrap";
import "ag-grid-community/styles/ag-grid.css"; // Mandatory CSS required by the grid
import "ag-grid-community/styles/ag-theme-quartz.css"; // Optional Theme applied to the grid
import "./training.css"
import { useNavigate, useParams } from "react-router-dom";
import { fetchAllEmployee, fetchTrainingDetails, saveTrainingMapperEmployee } from "../Api/ApiManager";

function TrainingEmployeeDetailsAdd() {
  const navigate = useNavigate()
  const {id} = useParams()
  const [rowData, setRowData] = useState([]);
  const [userList, setUserList] = useState([]);

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
        id:row.id,
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
    { field: "id" , hide:true, flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "Add" ,
      flex: 1, 
      cellStyle: { 'textAlign': 'left' },
      headerCheckboxSelection: true,
      checkboxSelection: true,
      showDisabledCheckboxes: true},
    { field: "employeeName" ,flex: 2, cellStyle: { 'textAlign': 'left' }},
    { field: "employeeCode" ,flex: 2, cellStyle: { 'textAlign': 'left' }},
    { field: "department" ,flex: 2, cellStyle: { 'textAlign': 'left' }},
    { field: "subDepartment" ,flex: 2, cellStyle: { 'textAlign': 'left' }},
    { field: "gender" ,flex: 2, cellStyle: { 'textAlign': 'left' }},
    { field: "email" ,flex: 2, cellStyle: { 'textAlign': 'left' }},
    { field: "dob" ,flex: 2, cellStyle: { 'textAlign': 'left' }}
  ]);
  function addUserList(event){
    var tempArr = [];
    event.api.getSelectedRows().map((row)=>{
      tempArr.push(row['id']);
    })
    setUserList(tempArr);
}
function addUser(event){
  let header = {
    trainingDetailKey: parseInt(id),
    userKeys:userList
  }
  console.log(header)
  saveTrainingMapperEmployee(header).
    then((response)=>{
      console.log(response);
      navigate('/training/'+id)
    });
    event.preventDefault();
  
}
  return (
    <>
      
          <Button className="float-start createButton" onClick={addUser}>
            Add Selected Employee to Training
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
              onSelectionChanged={addUserList}
          />
        </div>
      
        
    </>
  );
}

export default TrainingEmployeeDetailsAdd;
