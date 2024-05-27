package com.neeti.training.repository;

import com.neeti.training.bean.TrainingCompany;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TrainingCompanyRepository extends CrudRepository<TrainingCompany, UUID> {
    Iterable<TrainingCompany> findAllByStatus(String status);
}
