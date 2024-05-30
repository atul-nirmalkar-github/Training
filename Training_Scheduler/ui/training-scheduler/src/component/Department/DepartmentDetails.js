import { Button, Card, Container, Form, Row } from "react-bootstrap";
import "./department.css"
import { useEffect, useRef, useState } from "react";
import { fetchCompanyByStatus, fetchDepartmentByCompanyIdAndDeptCode, fetchDepartmentById, fetchDepartmentByStatus, saveDepartment } from "../Api/ApiManager";
import { useNavigate, useParams } from "react-router-dom";

function DepartmentDetails() {
  const navigate = useNavigate();
  const {id} = useParams();
  const [cmpKey,setCmpKey] = useState(Math.random());
  const [dptKey,setDptKey] = useState(Math.random());
  const [dptCodeKey,setDptCodeKey] = useState(Math.random());
  const [departmentKey,setDepartmentKey] = useState(null);
  const [departmentCode,setDepartmentCode] = useState('');
  const [departmentName,setDepartmentName] = useState('');
  const [companyKey,setCompanyKey] = useState(0);
  const [parentDepartmentKey,setParentDepartmentKey] = useState(0);
  let companyArr = useRef([]);
  let parentDepartmentArr = useRef([]);

  useEffect(()=>{
    loadCompanyList()
    loadDepartmentList()
    if(id=='create'){
      
    }else{
      loadDepartmentDetails()
    }
  },[])

  function loadDepartmentDetails(){
    fetchDepartmentById(id).
    then((data)=>{
      console.log(data);
      setDepartmentKey(data.departmentKey);
      setCompanyKey(data.trainingCompany.id);
      setParentDepartmentKey(data.parentDeptId);
      setDepartmentName(data.deptName);
      setDepartmentCode(data.deptCode);
    })
  }
  function loadCompanyList(){
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
    companyArr.current = tempArr;
    setCmpKey(Math.random())
  }
  function loadDepartmentList(){
    fetchDepartmentByStatus("ACTIVE").
    then((data)=>{
      createDepartmentOption(data)
    })
  }
  function createDepartmentOption(data){
    let tempArr = [];
    data.map((department)=>{
      tempArr.push((<option key={department.departmentKey} value={department.departmentKey}>{department.deptName}</option>))
    })
    parentDepartmentArr.current = tempArr;
    setDptKey(Math.random())
  }
  function handleSubmit (event) {
    if(departmentKey==null){
      checkDepartmentCodeAvailable();
    }else{
      callSaveDepartment();
    }
  }
  function checkDepartmentCodeAvailable(){
    fetchDepartmentByCompanyIdAndDeptCode(companyKey,departmentCode).
    then((response)=>{
      if(response.length==0){
        callSaveDepartment()
      }else if(response.length>0){
        alert('Department Code is already present please use unique department code')
      }
    })

  }
  function callSaveDepartment(){
    let header = {
      departmentKey:departmentKey,
      departmentCode:departmentCode,
      departmentName:departmentName,
      companyId:companyKey,
      parentDeptId:parentDepartmentKey
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
        <Form > 
        <Form.Group> 
          <Form.Label className="control-label">Company :</Form.Label> 
          <Form.Select 
            name="companyKey" 
            placeholder="Select Company"
            value={companyKey} 
            required
            key={cmpKey}
            onChange={(e)=>{setCompanyKey(e.target.value)}}>
            <option key={Math.random()} value={0}>None</option>
            {companyArr.current}
          </Form.Select>
        </Form.Group> 
        <br/>
        <Form.Group> 
          <Form.Label className="control-label">Parent Department :</Form.Label> 
          <Form.Select 
            name="parentDepartmentKey" 
            placeholder="Select Parent Department" 
            value={parentDepartmentKey}
            required
            key={dptKey}
            onChange={(e)=>{setParentDepartmentKey(e.target.value)}}>
            <option key={Math.random()} value={0}>None</option>
            {parentDepartmentArr.current}
          </Form.Select>
        </Form.Group> 
        <br/>
        <Form.Group> 
          <Form.Label className="control-label">Department Code:</Form.Label> 
          <Form.Control 
            type="text" 
            name="departmentCode" 
            placeholder="Enter Department Code"
            value={departmentCode} 
            key={dptCodeKey}
            onChange={(e)=>{
              setDepartmentCode(e.target.value)
            }}
            required/> 
        </Form.Group> 
        <br/>
        <Form.Group> 
          <Form.Label className="control-label">Department Name:</Form.Label> 
          <Form.Control 
            type="text" 
            name="departmentName" 
            placeholder="Enter Department Name" 
            value={departmentName}
            onChange={(e)=>{setDepartmentName(e.target.value)}}
            required/> 
        </Form.Group> 
        <br/>
        <Button variant="primary" onClick={handleSubmit}> 
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
