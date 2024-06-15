package com.neeti.training.controller;

import com.neeti.training.bean.Department;
import com.neeti.training.bean.Employee;
import com.neeti.training.dto.DepartmentDto;
import com.neeti.training.dto.EmployeeDto;
import com.neeti.training.service.DepartmentService;
import com.neeti.training.service.EmployeeService;
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

    @GetMapping(produces = "application/json")
    public Iterable<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping(produces = "application/json")
    public Employee saveEmployee(@RequestBody EmployeeDto employee){
        Employee tempEmployee = dtoToObject(employee);
        return employeeService.saveEmployee(tempEmployee);
    }
    @GetMapping(value = "/{employeeId}", produces = "application/json")
    public Employee getEmployeeById(@PathVariable String employeeId){
        return employeeService.getEmployeeById(employeeId);
    }


    public Employee dtoToObject(EmployeeDto dto){
        Employee employee = new Employee();
        if(dto.getId().isEmpty()){
            employee.setEmpCode(dto.getEmpCode());
            employee.setDepartmentId(dto.getDepartmentId());
            employee.setPositionId(dto.getPositionId());
            employee.setEmpType(dto.getEmpType());
            employee.setHolidayLocation(dto.getHolidayLocation());
            employee.setFirstName(dto.getFirstName());
            employee.setLastName(dto.getLastName());
            employee.setArea(dto.getArea());
            employee.setHireDate(LocalDateTime.parse(dto.getHireDate()));
            employee.setEnableOutdoorManagement(dto.getEnableOutdoorManagement());
            employee.setAaddhar(dto.getAaddhar());
            employee.setPassport(dto.getPassport());
            employee.setContactTel(dto.getContactTel());
            employee.setCardNo(dto.getCardNo());
            employee.setAddress(dto.getAddress());
            employee.setBirthday(dto.getBirthday());
            employee.setNickName(dto.getNickName());
            employee.setMobile(dto.getMobile());
            employee.setOfficeTel(dto.getOfficeTel());
            employee.setReligion(dto.getReligion());
            employee.setPostCode(dto.getPostCode());
            employee.setNational(dto.getNational());
            employee.setGender(dto.getGender());
            employee.setDriverLicenseMotorcycle(dto.getDriverLicenseMotorcycle());
            employee.setDriverLicenseAutomobile(dto.getDriverLicenseAutomobile());
            employee.setCity(dto.getCity());
            employee.setEmail(dto.getEmail());
            employee.setWhoCreated("Admin");
            employee.setWhoModified("Admin");
            employee.setWhenCreated(LocalDateTime.now());
            employee.setWhenModified(LocalDateTime.now());
        }
        return employee;
    }

}
