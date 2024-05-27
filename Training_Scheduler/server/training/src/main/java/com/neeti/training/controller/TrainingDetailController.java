/*
package com.neeti.training.controller;

import com.neeti.training.bean.TrainingDetail;
import com.neeti.training.dto.TrainingDetailDto;
import com.neeti.training.service.DepartmentService;
import com.neeti.training.service.TrainingDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/trainingdetail")
@CrossOrigin(origins = "http://localhost:3000")
public class TrainingDetailController {

    @Autowired
    DepartmentService departmentService;

    //@Autowired
    SubDepartmentService subDepartmentService;

    @Autowired
    TrainingDetailService trainingDetailService;

    @GetMapping(produces = "application/json")
    public Iterable<TrainingDetail> getAllTrainingDetail(){
        return trainingDetailService.getAllTrainingDetail();
    }

    @GetMapping(value = "/{trainingDetailKey}", produces = "application/json")
    public TrainingDetail getTrainingDetailById(@PathVariable int trainingDetailKey){
        return trainingDetailService.getTrainingDetailById(trainingDetailKey);
    }

    @GetMapping(value = "/{trainingDetailKey}/employee", produces = "application/json")
    public Iterable<Employee> getTrainingEmployeeById(@PathVariable int trainingDetailKey){
        return trainingDetailService.getTrainingEmployeeById(trainingDetailKey);
    }

    @PostMapping(produces = "application/json")
    public TrainingDetail saveTrainingDetail(@RequestBody TrainingDetailDto dto){
        System.out.println(dto.toString());
        TrainingDetail tempTrainingDetail = dtoToObject(dto);
        return trainingDetailService.saveTrainingDetail(tempTrainingDetail);
    }

    @DeleteMapping(value = "/{subDepartmentKey}", produces = "application/json")
    public long deleteTrainingDetailById(@PathVariable int trainingDetailKey){
        trainingDetailService.deleteTrainingDetail(trainingDetailKey);
        return trainingDetailKey;
    }

    public TrainingDetail dtoToObject(TrainingDetailDto dto){
        TrainingDetail trainingDetail = new TrainingDetail();
        if(dto.getTrainingDetailKey()==0){
            trainingDetail.setTrainingName(dto.getTrainingDetailName());
            trainingDetail.setDepartment(departmentService.getDepartmentById(dto.getDepartmentKey()));
            //trainingDetail.setSubDepartment(subDepartmentService.getSubDepartmentById(dto.getSubDepartmentKey()));
            trainingDetail.setCapacity(dto.getCapacity());
            trainingDetail.setStartOn(LocalDate.parse(dto.getStartOn()));
            trainingDetail.setEndOn(LocalDate.parse(dto.getEndOn()));
            trainingDetail.setStatus(dto.getStatus());
            trainingDetail.setWhoCreated("Admin");
            trainingDetail.setWhoModified("Admin");
            trainingDetail.setWhenCreated(LocalDateTime.now());
            trainingDetail.setWhenModified(LocalDateTime.now());
        }
        return trainingDetail;
    }

}
*/
