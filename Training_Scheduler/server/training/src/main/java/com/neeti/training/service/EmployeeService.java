package com.neeti.training.service;

import com.neeti.training.bean.Department;
import com.neeti.training.bean.Employee;
import com.neeti.training.repository.DepartmentRepository;
import com.neeti.training.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Iterable<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(String employeeKey){
        Optional<Employee> employee = employeeRepository.findById(UUID.fromString(employeeKey));
        return employee.orElse(null);
    }

    public Employee saveEmployee(Employee department){
        return employeeRepository.save(department);
    }

    public Boolean deleteDepartment(long employeeKey){

        return true;
    }
}
