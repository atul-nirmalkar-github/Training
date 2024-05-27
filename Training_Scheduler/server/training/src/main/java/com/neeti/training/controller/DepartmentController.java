package com.neeti.training.controller;

import com.neeti.training.bean.Department;
import com.neeti.training.bean.TrainingCompany;
import com.neeti.training.dto.GenericIdListDto;
import com.neeti.training.dto.DepartmentDto;
import com.neeti.training.service.DepartmentService;
import com.neeti.training.service.TrainingCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/department")
@CrossOrigin(origins = "http://localhost:3000")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @Autowired
    TrainingCompanyService trainingCompanyService;

    @GetMapping(produces = "application/json")
    public Iterable<Department> getAllDepartment(){
        return departmentService.getAllDepartment();
    }

    @GetMapping(value = "/status/{status}", produces = "application/json")
    public Iterable<Department> getAllDepartmentByStatus(@PathVariable String status){
        return departmentService.getAllDepartmentByStatus(status);
    }

    @GetMapping(value = "/{departmentKey}", produces = "application/json")
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

    @PostMapping(value = "/delete", produces = "application/json")
    public boolean deleteDepartmentById(@RequestBody GenericIdListDto dto){
        departmentService.deleteAllDepartment(dto.getIds());
        return true;
    }

    public Department dtoToObject(DepartmentDto dto){
        Department department = new Department();
        if(dto.getDepartmentKey()==0){
            department.setDeptName(dto.getDepartmentName());
            department.setDeptCode(dto.getDepartmentCode());
            department.setTrainingCompany(trainingCompanyService.getCompanyById(UUID.fromString(dto.getCompanyId())));
            department.setDefault(true);
            department.setParentDeptId(0);
            department.setStatus("ACTIVE");
            department.setWhoCreated("Admin");
            department.setWhoModified("Admin");
            department.setWhenCreated(LocalDateTime.now());
            department.setWhenModified(LocalDateTime.now());
        }
        return department;
    }

}
