/*
package com.neeti.training.controller;

import com.neeti.training.bean.Department;
import com.neeti.training.bean.Employee;
import com.neeti.training.dto.DepartmentDto;
import com.neeti.training.dto.EmployeeDto;
import com.neeti.training.service.DepartmentService;
import com.neeti.training.service.EmployeeService;
import com.neeti.training.service.SubDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @Autowired
    DepartmentService departmentService;
    @Autowired
    SubDepartmentService subDepartmentService;

    @GetMapping(produces = "application/json")
    public Iterable<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping(produces = "application/json")
    public Employee saveEmployee(@RequestBody EmployeeDto employee){
        Employee tempEmployee = dtoToObject(employee);
        return employeeService.saveEmployee(tempEmployee);
    }
    */
/*@GetMapping(value = "/{departmentKey}", produces = "application/json")
    public Department getDepartmentById(@PathVariable int departmentKey){
        return departmentService.getDepartmentById(departmentKey);
    }

    @PostMapping(produces = "application/json")
    public Department saveDepartment(@RequestBody DepartmentDto department){
        Department tempDepartment = dtoToObject(department);
        return departmentService.saveDepartment(tempDepartment);
    }

    @DeleteMapping(value = "/{departmentKey}", produces = "application/json")
    public long deleteDepartmentById(@PathVariable int departmentKey){
        departmentService.deleteDepartment(departmentKey);
        return departmentKey;
    }

    public Department dtoToObject(DepartmentDto dto){
        Department department = new Department();
        if(dto.getDepartmentKey()==0){
            department.setDepartmentName(dto.getDepartmentName());
            department.setDepartmentCode(dto.getDepartmentCode());
            department.setWhoCreated("Admin");
            department.setWhoModified("Admin");
            department.setWhenCreated(LocalDateTime.now());
            department.setWhenModified(LocalDateTime.now());
        }
        return department;
    }*//*


    public Employee dtoToObject(EmployeeDto dto){
        Employee employee = new Employee();
        if(dto.getId()==0){
            employee.setEmployeeName(dto.getEmployeeName());
            employee.setEmployeeCode(dto.getEmployeeCode());
            employee.setDob(LocalDate.parse(dto.getDob()));
            employee.setGender(dto.getGender());
            employee.setEmail(dto.getEmail());
            employee.setDepartment(departmentService.getDepartmentById(dto.getDepartmentKey()));
            //employee.setSubDepartment(subDepartmentService.getSubDepartmentById(dto.getSubDepartmentKey()));
            employee.setJobBand(dto.getJobBand());
            employee.setDesignation(dto.getDesignation());
            employee.setWhoCreated("Admin");
            employee.setWhoModified("Admin");
            employee.setWhenCreated(LocalDateTime.now());
            employee.setWhenModified(LocalDateTime.now());
        }
        return employee;
    }

}
*/
