import { Button, Card, Container, Form, Row } from "react-bootstrap";
import "./company.css"
import { useEffect, useState } from "react";
import { fetchCompanyById, saveCompany, saveDepartment } from "../Api/ApiManager";
import { useNavigate, useParams } from "react-router-dom";

function CompanyDetails() {
  const navigate = useNavigate();
  const {id} = useParams();
  const [uuid,setUUID] = useState(null);
  const [companyName,setCompanyName ] = useState('');
  const [companyPhone,setCompanyPhone ] = useState('');
  const [contactName,setContactName ] = useState('');
  const [contactPhone,setContactPhone ] = useState('');
  const [companyAddress,setCompanyAddress] = useState('');
  useEffect(()=>{
    if(id=='create'){

    }else{
      loadCompantDetails()
    }
  },[])
  function loadCompantDetails(){
    fetchCompanyById(id).
    then((data)=>{
      console.log(data);
      setUUID(data.id)
      setCompanyName(data.name)
      setCompanyPhone(data.companyPhone)
      setContactName(data.contactName)
      setContactPhone(data.contactPhone)
      setCompanyAddress(data.companyAddress)
    });
  }
  function handleSubmit (event) {
    callSaveCompany()
    event.preventDefault();
  };
  function callSaveCompany(){
    let header = {
      id:uuid,
      companyName:companyName,
      companyPhone:companyPhone,
      contactName:contactName,
      contactPhone:contactPhone,
      companyAddress:companyAddress
    }
    saveCompany(header).
    then((response)=>{
      navigate('/company')
    });
  }
  
  return (
    <>
    <div style={{ display: 'block',  
                  width: '100%',
                  height: '100%',  
                  padding: 30 }}> 
      
      <Card style={{ width: '100%',height:'100%' }}>
      <Card.Body>
        <Card.Title>Department Details</Card.Title>
        <Form onSubmit={handleSubmit}> 
          <Form.Group> 
            <Form.Label className="control-label">Company Name:</Form.Label> 
            <Form.Control 
              type="text" 
              name="companyName" 
              placeholder="Enter Company Name" 
              value={companyName}
              onChange={(e)=>{setCompanyName(e.target.value)}}
              required/> 
          </Form.Group> 
          <br/>
          <Form.Group> 
            <Form.Label className="control-label">Company Phone:</Form.Label> 
            <Form.Control 
              type="text" 
              name="companyPhone" 
              placeholder="Enter Company Phone" 
              value={companyPhone}
              onChange={(e)=>{setCompanyPhone(e.target.value)}}
              required/> 
          </Form.Group> 
          <br/>
          <Form.Group> 
            <Form.Label className="control-label">Contact Name:</Form.Label> 
            <Form.Control 
              type="text" 
              name="contactName" 
              placeholder="Enter Contact Name"
              value={contactName} 
              onChange={(e)=>{setContactName(e.target.value)}}
              required/> 
          </Form.Group> 
          <br/>
          <Form.Group> 
            <Form.Label className="control-label">Contact Phone:</Form.Label> 
            <Form.Control 
              type="text" 
              name="contactPhone" 
              placeholder="Enter Contact Phone" 
              value={contactPhone}
              onChange={(e)=>{setContactPhone(e.target.value)}}
              required/> 
          </Form.Group> 
          <br/>
          <Form.Group> 
            <Form.Label className="control-label">Company Address:</Form.Label> 
            <Form.Control 
              type="text" 
              name="companyAddress" 
              placeholder="Enter Company Address"
              value={companyAddress} 
              onChange={(e)=>{setCompanyAddress(e.target.value)}}
              required/> 
          </Form.Group> 
          <br/>
        <Button variant="primary" type="submit"> 
           Save Company
        </Button> 
      </Form> 
      </Card.Body>
    </Card>
    </div> 
         
      
        
    </>
  );
}

export default CompanyDetails;
