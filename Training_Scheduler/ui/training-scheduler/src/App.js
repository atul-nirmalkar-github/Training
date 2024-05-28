import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import Menu from './component/Menu';
import 'bootstrap/dist/css/bootstrap.min.css';
import Training from './component/Training/Training';
import Department from './component/Department/Department';
import SubDepartment from './component/SubDepartment/SubDepartment';
import TrainingDetails from './component/Training/TrainingDetails';
import DepartmentDetails from './component/Department/DepartmentDetails';
import SubDepartmentDetails from './component/SubDepartment/SubDepartmentDetails';
import Employee from './component/Employee/Employee';
import EmployeeDetails from './component/Employee/EmployeeDetails';
import TrainingEmployeeDetailsAdd from './component/Training/TrainingEmployeeDetailsAdd';
import TrainingEmployeeDetails from './component/Training/TrainingEmployeeDetails';
import Sidebar from './component/SideBar';
import Company from './component/Company/Company';
import CompanyDetails from './component/Company/CompanyDetails';
import { useRef, useState } from 'react';
function App() {
  let topMenu = useRef('Admin')
  const [sideBarKey,setKey] = useState(Math.random());
  function handler(menu){
    topMenu.current = menu;
    setKey(Math.random())
  }
  return (
    <BrowserRouter>
      <div className="App">
          <Menu handler={handler}/>
          <div style={{display:'flex'}}>
            <Sidebar key={sideBarKey} type={topMenu.current}/>
            <Routes>
              <Route path="/" element={<Training />}/>
              <Route index element={<Training />} />
              <Route exact path="/training" element={<Training />} />
              <Route exact path="/training/:id" element={<TrainingDetails />} />
              <Route exact path="/training/:id/employee" element={<TrainingEmployeeDetails />} />
              <Route exact path="/training/:id/employee/add" element={<TrainingEmployeeDetailsAdd />} />
              <Route exact path="/department" element={<Department />} />
              <Route exact path="/department/create" element={<DepartmentDetails />} />
              <Route exact path="/subdepartment" element={<SubDepartment />} />
              <Route exact path="/subdepartment/create" element={<SubDepartmentDetails />} />
              <Route exact path="/employee" element={<Employee />} />
              <Route exact path="/employee/create" element={<EmployeeDetails />} />
              <Route exact path="/company" element={<Company />} />
              <Route exact path="/company/:id" element={<CompanyDetails />} />
          </Routes>
          </div>
          
        
      </div>
    </BrowserRouter>
  );
}

export default App;
