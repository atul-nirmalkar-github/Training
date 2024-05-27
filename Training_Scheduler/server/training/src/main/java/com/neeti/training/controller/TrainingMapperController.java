/*
package com.neeti.training.controller;

import com.neeti.training.bean.TrainingDetail;
import com.neeti.training.bean.TrainingMapper;
import com.neeti.training.dto.TrainingDetailDto;
import com.neeti.training.dto.TrainingMapperDetailDto;
import com.neeti.training.service.DepartmentService;
import com.neeti.training.service.SubDepartmentService;
import com.neeti.training.service.TrainingDetailService;
import com.neeti.training.service.TrainingMapperDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/trainingmapper")
@CrossOrigin(origins = "http://localhost:3000")
public class TrainingMapperController {

    @Autowired
    TrainingMapperDetailService trainingMapperDetailService;

    @PostMapping(produces = "application/json")
    public Boolean saveTrainingMapperDetail(@RequestBody TrainingMapperDetailDto dto){
        return trainingMapperDetailService.saveTrainingMapper(dto);
    }


}
*/
