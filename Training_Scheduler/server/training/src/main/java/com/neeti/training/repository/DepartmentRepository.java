package com.neeti.training.repository;

import com.neeti.training.bean.Department;
import com.neeti.training.bean.TrainingCompany;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department,Long> {
    Iterable<Department> findAllByStatus(String status);
    Iterable<Department> findAllByDeptCode(String deptCode);
}
