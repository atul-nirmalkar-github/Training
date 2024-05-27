import { Button, Card, Container, Form, Row } from "react-bootstrap";
import "./department.css"
import { useEffect, useState } from "react";
import { fetchCompanyByStatus, saveDepartment } from "../Api/ApiManager";
import { useNavigate } from "react-router-dom";

function DepartmentDetails() {
  const navigate = useNavigate();
  const [departmentKey,setDepartmentKey] = useState(null);
  const [departmentCode,setDepartmentCode] = useState('');
  const [departmentName,setDepartmentName] = useState('');
  const [companyKey,setCompanyKey] = useState(0);
  const [companyArr,setCompanyArr] = useState([]);

  useEffect(()=>{
    loadCompany()
  },[])

  function loadCompany(){
    fetchCompanyByStatus("ACTIVE").
    then((data)=>{
      createCompanyOption(data)
    })
  }
  function createCompanyOption(data){
    let tempArr = [];
    data.map((company)=>{
      tempArr.push((<option key={company.id} value={company.id}>{company.name}</option>))
    })
    setCompanyArr(tempArr);
  }
  function handleSubmit (event) {
    callSaveDepartment()
    event.preventDefault();
  };
  function callSaveDepartment(){
    let header = {
      departmentKey:departmentKey,
      departmentCode:departmentCode,
      departmentName:departmentName,
      companyId:companyKey
    }
    saveDepartment(header).
    then((response)=>{
      navigate('/department')
    });
  }
  
  return (
    <>
    <div style={{ display: 'block',  
                  width: '100%',
                  height: '100%',  
                  padding: 30 }}> 
      
      <Card style={{ width: '50%',height:'100%',textAlign:'left' }}>
      <Card.Body >
        <Card.Title>Department Details</Card.Title>
        <Form onSubmit={handleSubmit}> 
        <Form.Group> 
          <Form.Label className="control-label">Company :</Form.Label> 
          <Form.Select 
            name="companyKey" 
            placeholder="Select Company" 
            required
            onChange={(e)=>{setCompanyKey(e.target.value)}}>
            <option key={Math.random()} value={'none'}>None</option>
            {companyArr}
          </Form.Select>
        </Form.Group> 
        <br/>
        <Form.Group> 
          <Form.Label className="control-label">Department Code:</Form.Label> 
          <Form.Control 
            type="text" 
            name="departmentCode" 
            placeholder="Enter Department Code" 
            onChange={(e)=>{setDepartmentCode(e.target.value)}}
            required/> 
        </Form.Group> 
        <br/>
        <Form.Group> 
          <Form.Label className="control-label">Department Name:</Form.Label> 
          <Form.Control 
            type="text" 
            name="departmentName" 
            placeholder="Enter Department Name" 
            onChange={(e)=>{setDepartmentName(e.target.value)}}
            required/> 
        </Form.Group> 
        <br/>
        <Button variant="primary" type="submit"> 
           Save Department
        </Button> 
      </Form> 
      </Card.Body>
    </Card>
    </div> 
         
      
        
    </>
  );
}

export default DepartmentDetails;
