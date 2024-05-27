package com.neeti.training.service;

import com.neeti.training.bean.Department;
import com.neeti.training.bean.TrainingCompany;
import com.neeti.training.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public Iterable<Department> getAllDepartment(){
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(long departmentKey){
        Optional<Department> department = departmentRepository.findById(departmentKey);
        return department.orElse(null);
    }

    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }

    public Boolean deleteDepartment(long departmentKey){
        departmentRepository.deleteById(departmentKey);
        return true;
    }

    public Boolean deleteAllDepartment(List<String> ids) {
        ids.forEach((id) -> {
            Optional<Department> department = departmentRepository.findById(Long.parseLong(id));
            if(department.isPresent()){
                Department tempDepartment = department.get();
                tempDepartment.setStatus("INACTIVE");
                departmentRepository.save(tempDepartment);
            }
        });
        return true;
    }

    public Iterable<Department> getAllDepartmentByStatus(String status) {
        return departmentRepository.findAllByStatus(status);
    }
}
