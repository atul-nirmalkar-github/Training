/*
package com.neeti.training.service;

import com.neeti.training.bean.Employee;
import com.neeti.training.bean.TrainingDetail;
import com.neeti.training.bean.TrainingMapper;
import com.neeti.training.repository.TrainingDetailRepository;
import com.neeti.training.repository.TrainingMapperDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TrainingDetailService {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    TrainingDetailRepository trainingDetailRepository;

    @Autowired
    TrainingMapperDetailRepository trainingMapperDetailRepository;

    public Iterable<TrainingDetail> getAllTrainingDetail(){
        return trainingDetailRepository.findAll();
    }

    public TrainingDetail getTrainingDetailById(int trainingDetailKey){
        Optional<TrainingDetail> trainingDetail = trainingDetailRepository.findById(trainingDetailKey);
        return trainingDetail.orElse(null);
    }

    public TrainingDetail saveTrainingDetail(TrainingDetail trainingDetail){
        return trainingDetailRepository.save(trainingDetail);
    }

    public Boolean deleteTrainingDetail(int trainingDetailKey){
        trainingDetailRepository.deleteById(trainingDetailKey);
        return true;
    }

    public Iterable<Employee> getTrainingEmployeeById(int trainingDetailKey) {
        List<Employee> employees = new ArrayList<Employee>();
        Iterable<TrainingMapper> trainingMappers = trainingMapperDetailRepository.findByTrainingDetailKey(trainingDetailKey);
        trainingMappers.forEach((trainingMapper)->{
            employees.add(employeeService.getEmployeeById(trainingMapper.getEmployeeKey()));
        });
        return employees;
    }
}
*/
