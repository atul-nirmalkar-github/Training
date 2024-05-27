/*
package com.neeti.training.controller;

import com.neeti.training.bean.Department;
import com.neeti.training.dto.DepartmentDto;
import com.neeti.training.dto.SubDepartmentDto;
import com.neeti.training.service.DepartmentService;
import com.neeti.training.service.SubDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

//@RestController
//@RequestMapping("/subdepartment")
//@CrossOrigin(origins = "http://localhost:3000")
public class SubDepartmentController {

    */
/*//*
/@Autowired
    DepartmentService departmentService;

    //@Autowired
    SubDepartmentService subDepartmentService;

    //@GetMapping(produces = "application/json")
    public Iterable<SubDepartment> getAllSubDepartment(){
        return subDepartmentService.getAllSubDepartment();
    }

    //@GetMapping(value = "/{subDepartmentKey}", produces = "application/json")
    public SubDepartment getSubDepartmentById(@PathVariable int subDepartmentKey){
        return subDepartmentService.getSubDepartmentById(subDepartmentKey);
    }

    //@GetMapping(value = "/department/{departmentKey}", produces = "application/json")
    public Iterable<SubDepartment> getSubDepartmentByDepartmentKey(@PathVariable int departmentKey){
        return subDepartmentService.getSubDepartmentByDepartmentKey(departmentKey);
    }

    //@PostMapping(produces = "application/json")
    public SubDepartment saveSubDepartment(@RequestBody SubDepartmentDto dto){
        SubDepartment tempSubDepartment = dtoToObject(dto);
        return subDepartmentService.saveSubDepartment(tempSubDepartment);
    }

    //@DeleteMapping(value = "/{subDepartmentKey}", produces = "application/json")
    public long deleteSubDepartmentById(@PathVariable int subDepartmentKey){
        subDepartmentService.deleteSubDepartment(subDepartmentKey);
        return subDepartmentKey;
    }

    public SubDepartment dtoToObject(SubDepartmentDto dto){
        SubDepartment subDepartment = new SubDepartment();
        if(dto.getSubDepartmentKey()==0){
            subDepartment.setSubDepartmentName(dto.getSubDepartmentName());
            subDepartment.setDepartment(departmentService.getDepartmentById(dto.getDepartmentKey()));
            subDepartment.setWhoCreated("Admin");
            subDepartment.setWhoModified("Admin");
            subDepartment.setWhenCreated(LocalDateTime.now());
            subDepartment.setWhenModified(LocalDateTime.now());
        }
        return subDepartment;
    }*//*


}
*/
