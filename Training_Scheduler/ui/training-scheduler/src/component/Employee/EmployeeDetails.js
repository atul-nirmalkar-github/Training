import { Button, Card, Container, Form, Row } from "react-bootstrap";
import "./employee.css"
import { useEffect, useState } from "react";
import { fetchDepartment, fetchSubDepartmentByDepartmentKey, saveEmployee, saveTrainingDetail } from "../Api/ApiManager";
import { useNavigate } from "react-router-dom";

function EmployeeDetails() {
  const navigate = useNavigate()
  const [employeeKey,setEmployeeKey] = useState(0);
  const [employeeName,setEmployeeName] = useState('');
  const [employeeCode,setEmployeeCode] = useState('');
  const [gender,setGender] = useState('male');
  const [dob,setDob] = useState('');
  const [email,setEmail] = useState('');
  const [departmentKey,setDepartmentKey] = useState(0);
  const [departmentArr,setDepartmentArr] = useState([]);
  const [subDepartmentKey,setSubDepartmentKey] = useState(0);
  const [subDepartmentArr,setSubDepartmentArr] = useState([]);
  const [jobBand,setJobBand] = useState('');
  const [designation,setDesignation] = useState('');
  
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
  function loadSubDepartment(departmentKey){
    setDepartmentKey(departmentKey)
    setSubDepartmentArr([])
    fetchSubDepartmentByDepartmentKey(departmentKey).
    then((data)=>{
      createSubDepartmentOpton(data)
    })
  }
  function createSubDepartmentOpton(data){
    let tempArr = [];
    data.map((dept)=>{
      tempArr.push((<option key={dept.subDepartmentKey} value={dept.subDepartmentKey}>{dept.subDepartmentName}</option>))
    })
    setSubDepartmentArr(tempArr);
  }
  function handleSubmit (event) {
    let header = {
      employeeName:employeeName,
      employeeCode:employeeCode,
      gender:gender,
      email:email,
      dob:dob,
      departmentKey:departmentKey,
      subDepartmentKey:subDepartmentKey,
      jobBand:jobBand,
      designation:designation,
    }
    console.log(header)
    saveEmployee(header).
    then((response)=>{
      console.log(response);
      navigate('/employee')
    });
    event.preventDefault();
  };
  return (
    <>
    <div style={{ display: 'block',  
                  width: '100%',
                  height: '100%',  
                  padding: 30 }}>

      <Card style={{ width: '50%',height:'100%' }}>
        <Card.Body>
          <Card.Title>Employee Details</Card.Title>
          <Form onSubmit={handleSubmit}> 
            <Form.Group> 
              <Form.Label className="control-label">Employee Name:</Form.Label> 
              <Form.Control 
                type="text" 
                placeholder="Enter Employee Name" 
                onChange={(e)=>{setEmployeeName(e.target.value)}}/> 
            </Form.Group> 
            <br/>
            <Form.Group> 
              <Form.Label className="control-label">Employee Code:</Form.Label> 
                <Form.Control 
                  type="text" 
                  placeholder="Enter Employee Code" 
                  onChange={(e)=>{setEmployeeCode(e.target.value)}}/> 
            </Form.Group> 
            <br/>
            <Form.Group> 
              <Form.Label className="control-label">Gender :</Form.Label> 
              <Form.Select 
                name="subDepartmentKey" 
                placeholder="Select Sub Department" 
                required 
                onChange={(e)=>{
                  setGender(e.target.value)
                }}>
                <option value='male'>Male</option>
                <option value='female'>Female</option>
              </Form.Select>
            </Form.Group> 
            <br/>
            <Form.Group> 
              <Form.Label className="control-label">Email:</Form.Label> 
                <Form.Control 
                  type="text" 
                  placeholder="Enter Employee Email" 
                  onChange={(e)=>{setEmail(e.target.value)}}/> 
            </Form.Group> 
            <br/>
            <Form.Group> 
              <Form.Label className="control-label">Date Of Birth:</Form.Label> 
              <Form.Control 
                type="date" 
                placeholder="Enter Start Date" 
                onChange={(e)=>{
                  setDob(e.target.value)
                }}/> 
            </Form.Group> 
            <br/>
            <Form.Group> 
              <Form.Label className="control-label">Department :</Form.Label> 
              <Form.Select 
                name="departmentKey" 
                placeholder="Select Department" 
                required 
                onChange={(e)=>{
                  loadSubDepartment(e.target.value)
                }}>
                {departmentArr}
              </Form.Select>
            </Form.Group> 
            <br/>
            <Form.Group> 
              <Form.Label className="control-label">Sub Department :</Form.Label> 
              <Form.Select 
                name="subDepartmentKey" 
                placeholder="Select Sub Department" 
                required 
                onChange={(e)=>{
                  setSubDepartmentKey(e.target.value)
                }}>
                <option value='None'>None</option>
                {subDepartmentArr}
              </Form.Select>
            </Form.Group> 
            <br/>
            <Form.Group> 
              <Form.Label className="control-label">Job Band:</Form.Label> 
              <Form.Control 
                type="text" 
                placeholder="Enter Job Band" 
                onChange={(e)=>{setJobBand(e.target.value)}}
                required/> 
            </Form.Group> 
            <br/>
            <Form.Group> 
              <Form.Label className="control-label">Designation:</Form.Label> 
              <Form.Control 
                type="text" 
                placeholder="Enter Designation" 
                onChange={(e)=>{setDesignation(e.target.value)}}
                required/> 
            </Form.Group> 
            <br/>
            <Button variant="primary" type="submit"> 
              Register Employee 
            </Button> 
          </Form> 
        </Card.Body>
      </Card>
      
    </div> 
         
      
        
    </>
  );
}

export default EmployeeDetails;
