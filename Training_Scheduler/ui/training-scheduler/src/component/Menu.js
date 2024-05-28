import { useState } from "react";
import {  Container, Nav, NavDropdown, Navbar, Offcanvas } from "react-bootstrap";
import {  useNavigate } from "react-router-dom";


function Menu(props) {
    const navigate = useNavigate()
    function clickHandler(menu){
        console.log(props.handler(menu))
        //navigate('/'+url);
    }
  return (
    <>
        <Navbar bg="dark" data-bs-theme="dark">
        <Container>
            <Navbar.Brand href="/training">Neeti</Navbar.Brand>
            <Nav className="me-auto">
              <Nav.Link onClick={()=>{clickHandler('Admin')}}>Admin</Nav.Link>
              <Nav.Link onClick={()=>{clickHandler('Master')}}>Master</Nav.Link>
              <Nav.Link onClick={()=>{clickHandler('Transition')}}>Transition</Nav.Link>
              <Nav.Link onClick={()=>{clickHandler('Reports')}}>Reports</Nav.Link>
              <Nav.Link onClick={()=>{clickHandler('Logout')}}>Logout</Nav.Link>
            </Nav>
        </Container>
        </Navbar>
    </>
  );
}

export default Menu;
