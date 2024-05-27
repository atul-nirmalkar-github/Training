import { Button, Card, Container, Form, Row } from "react-bootstrap";
import "./training.css"
import { useEffect, useState } from "react";
import { fetchDepartment, fetchSubDepartmentByDepartmentKey, fetchTrainingDetailBKey, fetchTrainingDetailByKey, saveTrainingDetail } from "../Api/ApiManager";
import { useNavigate, useParams } from "react-router-dom";

function TrainingDetails() {
  const navigate = useNavigate()
  const {id} = useParams()
  const [trainingKey,setTrainingKey] = useState(0);
  const [trainingName,setTrainingName] = useState('');
  const [departmentKey,setDepartmentKey] = useState(0);
  const [departmentArr,setDepartmentArr] = useState([]);
  const [subDepartmentKey,setSubDepartmentKey] = useState(0);
  const [subDepartmentArr,setSubDepartmentArr] = useState([]);
  const [capacity,setCapacty] = useState(0);
  const [startOn,setStartOn] = useState('');
  const [endOn,setEndOn] = useState('');
  const [disable,setDisable] = useState(true);

  useEffect(()=>{
    loadDepartment()
    if(id=='create'){
      setDisable(true);
    }else{
      setDisable(false);
      loadTrainingDetail(id)
    }
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
      trainingDetailName:trainingName,
      departmentKey:departmentKey,
      subDepartmentKey:subDepartmentKey,
      capacity:capacity,
      startOn:startOn,
      endOn:endOn
    }
    console.log(header)
    saveTrainingDetail(header).
    then((response)=>{
      console.log(response);
      navigate('/training')
    });
    event.preventDefault();
  };

  function loadTrainingDetail(trainingDetailKey){
    fetchTrainingDetailByKey(trainingDetailKey).
    then((data)=>{
      setTrainingKey(trainingDetailKey)
      setTrainingName(data.trainingName)
      setDepartmentKey(data.department.departmentKey)
      loadSubDepartment(data.department.departmentKey)
      setSubDepartmentKey(data.subDepartment.subDepartmentKey)
      setCapacty(data.capacity)
      setStartOn(data.startOn)
      setEndOn(data.endOn)
      console.log(data)
    })
  }
  function navigateToAddEmployee(){
    navigate('/training/'+id+'/employee/add')
  }
  function navigateToTrainingEmployee(){
    navigate('/training/'+id+'/employee')
  }
  
  return (
    <>
    <div style={{ display: 'block',  
                  width: '100%',
                  height: '100%',  
                  padding: 30 }}>

      <Card style={{ width: '50%',height:'100%' }}>
        <Card.Body>
          <Card.Title>Training Details</Card.Title>
          <Form onSubmit={handleSubmit}> 
            <Form.Group> 
              <Form.Label className="control-label">Training Name:</Form.Label> 
              <Form.Control 
                type="text" 
                value={trainingName}
                placeholder="Enter Training Name" 
                onChange={(e)=>{setTrainingName(e.target.value)}}/> 
            </Form.Group> 
            <br/>
            <Form.Group> 
              <Form.Label className="control-label">Department :</Form.Label> 
              <Form.Select 
                name="departmentKey" 
                value={departmentKey}
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
                value={subDepartmentKey}
                onChange={(e)=>{
                  setSubDepartmentKey(e.target.value)
                }}>
                <option value='None'>None</option>
                {subDepartmentArr}
              </Form.Select>
            </Form.Group> 
            <br/>
            <Form.Group> 
              <Form.Label className="control-label">Capacity:</Form.Label> 
              <Form.Control 
                type="text" 
                placeholder="Enter Capacity" 
                value={capacity}
                onChange={(e)=>{setCapacty(e.target.value)}}
                required/> 
            </Form.Group> 
            <br/>
            <Form.Group> 
              <Form.Label className="control-label">Start On:</Form.Label> 
              <Form.Control 
                type="date" 
                placeholder="Enter Start Date"
                value={startOn} 
                onChange={(e)=>{
                  setStartOn(e.target.value)
                }}/> 
            </Form.Group> 
            <br/>
            <Form.Group> 
              <Form.Label className="control-label">End On:</Form.Label> 
              <Form.Control 
                type="date" 
                placeholder="Enter End Date"
                value={endOn} 
                onChange={(e)=>{
                  setEndOn(e.target.value)
                }}/> 
            </Form.Group> 
            

            <br/>
            <Button variant="primary" type="submit"> 
              Schedule Training 
            </Button>
            &nbsp;&nbsp;
            <Button variant="primary" type="button" disabled={disable} onClick={navigateToTrainingEmployee}> 
              Employee 
            </Button> 
            &nbsp;&nbsp;
            <Button variant="primary" type="button" disabled={disable} onClick={navigateToAddEmployee}> 
              Add Employee 
            </Button> 
          </Form> 
        </Card.Body>
      </Card>
      
    </div> 
         
      
        
    </>
  );
}

export default TrainingDetails;
