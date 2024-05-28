/*
package com.neeti.training.service;

import com.neeti.training.bean.TrainingDetail;
import com.neeti.training.bean.TrainingMapper;
import com.neeti.training.dto.TrainingMapperDetailDto;
import com.neeti.training.repository.TrainingDetailRepository;
import com.neeti.training.repository.TrainingMapperDetailRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainingMapperDetailService {

    @Autowired
    TrainingMapperDetailRepository trainingMapperDetailRepository;

   @Transactional
    public Boolean saveTrainingMapper(TrainingMapperDetailDto dto){
       long trainingDetailKey = dto.getTrainingDetailKey();
       List<Integer> userKeys = dto.getUserKeys();
       userKeys.forEach((userKey)->{
           TrainingMapper trainingMapper = new TrainingMapper();
           trainingMapper.setTrainingDetailKey(trainingDetailKey);
           trainingMapper.setEmployeeKey(userKey);
           trainingMapperDetailRepository.save(trainingMapper);
       });
       return true;
    }



}
*/
