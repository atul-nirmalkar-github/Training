import React from 'react';
import {
  CDBSidebar,
  CDBSidebarContent,
  CDBSidebarFooter,
  CDBSidebarHeader,
  CDBSidebarMenu,
  CDBSidebarMenuItem,
} from 'cdbreact';
import { NavLink } from 'react-router-dom';
import SidebarMenu from 'react-bootstrap-sidebar-menu';

const SideMenu = () => {
  return (
    <SidebarMenu>
      <SidebarMenu.Header>
        <SidebarMenu.Brand>
          Test
        </SidebarMenu.Brand>
        <SidebarMenu.Toggle />
      </SidebarMenu.Header>
    </SidebarMenu>
  );
};

export default SideMenu;