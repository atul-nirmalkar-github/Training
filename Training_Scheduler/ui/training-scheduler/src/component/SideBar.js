import React, { useEffect, useState } from 'react';
import {
  CDBSidebar,
  CDBSidebarContent,
  CDBSidebarFooter,
  CDBSidebarHeader,
  CDBSidebarMenu,
  CDBSidebarMenuItem,
} from 'cdbreact';
import { NavLink } from 'react-router-dom';

const Sidebar = (props) => {
  const [sideMenuAr,setSideMenuAr] = useState([])
  useEffect(()=>{
    if(props.type==undefined){

    }else{
      if(props.type=='Admin'){
        let tempAr = [];
        setSideMenuAr([])
        tempAr.push(<>
          <NavLink exact to="/company" activeClassName="activeClicked">
            <CDBSidebarMenuItem icon="columns">Comapny</CDBSidebarMenuItem>
          </NavLink>
          <NavLink exact to="/department" activeClassName="activeClicked">
            <CDBSidebarMenuItem icon="columns">Department</CDBSidebarMenuItem>
          </NavLink>
          <NavLink exact to="/employee" activeClassName="activeClicked">
            <CDBSidebarMenuItem icon="user">Employee</CDBSidebarMenuItem>
          </NavLink>
        </>)

        setSideMenuAr(tempAr)
      }
      else{
        setSideMenuAr([])
      }
    }
  },[])
  // admin -- 
  return (
    <div style={{ display: 'flex', height: '100vh', overflow: 'scroll initial' }}>
      <CDBSidebar textColor="#fff" backgroundColor="#333">
        <CDBSidebarHeader prefix={<i className="fa fa-bars fa-large"></i>}>
          <a href="/" className="text-decoration-none" style={{ color: 'inherit' }}>
            {props.type}
          </a>
        </CDBSidebarHeader>
        <CDBSidebarContent className="sidebar-content">
          <CDBSidebarMenu>
            {sideMenuAr}    
          </CDBSidebarMenu>
        </CDBSidebarContent>
      </CDBSidebar>
    </div>
  );
};

export default Sidebar;