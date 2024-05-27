import { Button, Card, Form } from "react-bootstrap";
import "./subdepartment.css"
import { useEffect, useState } from "react";
import { fetchDepartment, saveSubDepartment } from "../Api/ApiManager";
import { useNavigate } from "react-router-dom";

function SubDepartmentDetails() {
  const navigate = useNavigate();
  const [subDepartmentKey,setSubDepartmentKey] = useState(0);
  const [subDepartmentName,setSubDepartmentName] = useState('');
  const [departmentKey,setDepartmentKey] = useState(0);
  const [departmentArr,setDepartmentArr] = useState([]);

  useEffect(()=>{
    loadDepartment()
  },[])

  function loadDepartment(){
    fetchDepartment().
    then((data)=>{
      createDepartmentOpton(data)
    })
  }
  function createDepartmentOpton(data){
    let tempArr = [];
    data.map((dept)=>{
      tempArr.push((<option key={dept.departmentKey} value={dept.departmentKey}>{dept.departmentName}</option>))
    })
    setDepartmentArr(tempArr);
  }

  function handleSubmit (event) {
    callSaveSubDepartment()
    event.preventDefault();
  };
  function callSaveSubDepartment(){
    let header = {
      subDepartmentName:subDepartmentName,
      departmentKey:departmentKey
    }
    saveSubDepartment(header).
    then((response)=>{
      navigate('/subdepartment')
    });
  }
  
  return (
    <>
    <div style={{ display: 'block',  
                  width: '100%',
                  height: '100%',  
                  padding: 30 }}> 
      
      <Card style={{ width: '50%',height:'100%' }}>
      <Card.Body>
        <Card.Title>SubDepartment Details</Card.Title>
        <Form onSubmit={handleSubmit}> 
          <Form.Group> 
            <Form.Label className="control-label">Sub Department Name:</Form.Label> 
            <Form.Control 
              type="text" 
              name="subDepartmentName" 
              placeholder="Enter Sub Department Name" 
              onChange={(e)=>{setSubDepartmentName(e.target.value)}}
              required/> 
          </Form.Group> 
          <Form.Group> 
            <Form.Label className="control-label">Department :</Form.Label> 
            <Form.Select name="departmentKey" placeholder="Select Department" required onChange={(e)=>{setDepartmentKey(e.target.value)}}>
              {departmentArr}
            </Form.Select>
          </Form.Group> 
          <br/>
          <Button variant="primary" type="submit"> 
            Save Sub Department
          </Button> 
        </Form> 
      </Card.Body>
    </Card>
    </div> 
    </>
  );
}

export default SubDepartmentDetails;
