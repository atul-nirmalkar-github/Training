import { AgGridReact } from "ag-grid-react";
import { useEffect, useState } from "react";
import { Button } from "react-bootstrap";
import "ag-grid-community/styles/ag-grid.css"; // Mandatory CSS required by the grid
import "ag-grid-community/styles/ag-theme-quartz.css"; // Optional Theme applied to the grid
import "./training.css"
import { useNavigate } from "react-router-dom";
import { fetchTrainingDetails } from "../Api/ApiManager";

function Training() {
  const navigate = useNavigate()
  const [rowData, setRowData] = useState([]);

  useEffect(()=>{
    fetchTrainingDetails().
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
        id: row.id,
        trainingName: row.trainingName,
        department: row.department.departmentName,
        subDepartment: row.subDepartment.departmentName,
        subDepartment: row.subDepartment.departmentName,
        startOn: row.startOn,
        endOn: row.endOn,
        capacity: row.capacity,
        registeredUser: 0,
        status: row.status
      })
    })
    setRowData(tempArr);
  }
  
  // Column Definitions: Defines the columns to be displayed.
  const [colDefs, setColDefs] = useState([
    { field: "id" , hide:true, flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "trainingName" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "department" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "subDepartment" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "startOn" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "endOn" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "capacity" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "registeredUser" ,flex: 1, cellStyle: { 'textAlign': 'left' }},
    { field: "status" ,flex: 1, cellStyle: { 'textAlign': 'left' }}
  ]);
  function clickHandler(url){
    navigate(url);
  }
  function handleRowClick(rowData){
    navigate('/training/'+rowData.data.id)
  }
  return (
    <>  
        <div style={{width:'100%'}}>
          <Button className="float-start createButton" onClick={() => {clickHandler("/training/create")}}>
              Schedule Training
          </Button>
          <div
            className="ag-theme-quartz gridMargin" // applying the grid theme
            style={{ height: 700 }} // the grid will fill the size of the parent container
          >
            <AgGridReact
                rowData={rowData}
                columnDefs={colDefs}
                onRowClicked={handleRowClick}
            />
          </div>
  
        </div>
             
        
    </>
  );
}

export default Training;
