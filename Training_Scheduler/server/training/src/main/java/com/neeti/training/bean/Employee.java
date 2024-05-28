/*
package com.neeti.training.bean;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "employeeName",nullable = false,unique = true)
    private String employeeName;

    @Column(name = "employeeCode",nullable = false)
    private String employeeCode;

    @Column(name = "gender",nullable = false)
    private String gender;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "dob",nullable = false)
    private LocalDate dob;

    @ManyToOne()
    @JoinColumn(name = "departmentKey", referencedColumnName = "id")
    private Department department;

    */
/*@ManyToOne()
    @JoinColumn(name = "subDepartmentKey", referencedColumnName = "subDepartmentKey")
    private SubDepartment subDepartment;*//*


    @Column(name = "jobBand")
    private String jobBand;

    @Column(name = "designation")
    private String designation;

    @Column(name = "whoCreated")
    private String whoCreated;

    @Column(name = "whenCreated")
    private LocalDateTime whenCreated;

    @Column(name = "whoModified")
    private String whoModified;

    @Column(name = "whenModified")
    private LocalDateTime whenModified;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

   */
/* public SubDepartment getSubDepartment() {
        return subDepartment;
    }

    public void setSubDepartment(SubDepartment subDepartment) {
        this.subDepartment = subDepartment;
    }*//*


    public String getJobBand() {
        return jobBand;
    }

    public void setJobBand(String jobBand) {
        this.jobBand = jobBand;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
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
}
*/
