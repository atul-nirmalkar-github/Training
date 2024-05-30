package com.neeti.training.bean;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="training_department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long departmentKey;

    @ManyToOne()
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private TrainingCompany trainingCompany;

    @Column(name = "dept_code",nullable = false)
    private String deptCode;

    @Column(name = "dept_name",nullable = false)
    private String deptName;

    @Column(name = "is_default",nullable = false)
    private Boolean isDefault;

    @Column(name = "parent_dept_id",nullable = false)
    private Integer parentDeptId;

    @Column(name = "status",nullable = false)
    private String status;

    @Column(name = "whoCreated")
    private String whoCreated;

    @Column(name = "whenCreated")
    private LocalDateTime whenCreated;

    @Column(name = "whoModified")
    private String whoModified;

    @Column(name = "whenModified")
    private LocalDateTime whenModified;

    public long getDepartmentKey() {
        return departmentKey;
    }

    public void setDepartmentKey(long departmentKey) {
        this.departmentKey = departmentKey;
    }

    public TrainingCompany getTrainingCompany() {
        return trainingCompany;
    }

    public void setTrainingCompany(TrainingCompany trainingCompany) {
        this.trainingCompany = trainingCompany;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public Integer getParentDeptId() {
        return parentDeptId;
    }

    public void setParentDeptId(Integer parentDeptId) {
        this.parentDeptId = parentDeptId;
    }

    public String getWhoCreated() {
        return whoCreated;
    }

    public void setWhoCreated(String whoCreated) {
        this.whoCreated = whoCreated;
    }

    public LocalDateTime getWhenCreated() {
        return whenCreated;
    }

    public void setWhenCreated(LocalDateTime whenCreated) {
        this.whenCreated = whenCreated;
    }

    public String getWhoModified() {
        return whoModified;
    }

    public void setWhoModified(String whoModified) {
        this.whoModified = whoModified;
    }

    public LocalDateTime getWhenModified() {
        return whenModified;
    }

    public void setWhenModified(LocalDateTime whenModified) {
        this.whenModified = whenModified;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
