import { useState } from "react";
import {  Container, Nav, NavDropdown, Navbar, Offcanvas } from "react-bootstrap";
import {  useNavigate } from "react-router-dom";


function Menu(props) {
    const navigate = useNavigate()
    function clickHandler(url){
        console.log(props.handler(url))
        navigate('/'+url);
    }
  return (
    <>
        <Navbar bg="dark" data-bs-theme="dark">
        <Container>
            <Navbar.Brand href="/training">Neeti</Navbar.Brand>
            <Nav className="me-auto">
            <Nav.Link onClick={()=>{clickHandler('company')}}>Company</Nav.Link>
            <Nav.Link onClick={()=>{clickHandler('training')}}>Schedule</Nav.Link>
            <Nav.Link onClick={()=>{clickHandler('department')}}>Department</Nav.Link>
            <Nav.Link onClick={()=>{clickHandler('subdepartment')}}>Sub Department</Nav.Link>
            <Nav.Link onClick={()=>{clickHandler('employee')}}>Employee</Nav.Link>
            <NavDropdown title="Master" id="navbarScrollingDropdown">
              <NavDropdown.Item href="#action3">Training Schedule</NavDropdown.Item>
              <NavDropdown.Item href="#action4">Department</NavDropdown.Item>
              <NavDropdown.Item href="#action5">Sub Department</NavDropdown.Item>
              <NavDropdown.Item href="#action5">Employee</NavDropdown.Item>
            </NavDropdown>
            </Nav>
        </Container>
        </Navbar>
    </>
  );
}

export default Menu;
