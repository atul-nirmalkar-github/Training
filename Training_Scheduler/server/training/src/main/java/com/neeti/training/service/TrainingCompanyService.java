package com.neeti.training.service;

import com.neeti.training.bean.TrainingCompany;
import com.neeti.training.dto.CompanyDto;
import com.neeti.training.repository.TrainingCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TrainingCompanyService {

    @Autowired
    TrainingCompanyRepository trainingCompanyRepository;

    public Iterable<TrainingCompany> getAllCompany(){
        return trainingCompanyRepository.findAll();
    }

    public TrainingCompany getCompanyById(UUID companyKey){
        Optional<TrainingCompany> company = trainingCompanyRepository.findById(companyKey);
        return company.orElse(null);
    }

    public TrainingCompany saveCompany(TrainingCompany company){
        return trainingCompanyRepository.save(company);
    }

    public Boolean deleteCompany(UUID companyKey){
        trainingCompanyRepository.deleteById(companyKey);
        return true;
    }

    @Transactional
    public boolean deleteAllCompany(List<String> ids) {
        ids.forEach((id) -> {
            Optional<TrainingCompany> company = trainingCompanyRepository.findById(UUID.fromString(id));
            if(company.isPresent()){
                TrainingCompany tempCompany = company.get();
                tempCompany.setStatus("INACTIVE");
                trainingCompanyRepository.save(tempCompany);
            }
        });
        return true;
    }

    public Iterable<TrainingCompany> getAllCompanyByStatus(String status) {
        return trainingCompanyRepository.findAllByStatus(status);
    }
}
