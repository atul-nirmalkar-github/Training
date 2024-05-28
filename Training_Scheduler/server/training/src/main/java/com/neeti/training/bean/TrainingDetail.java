/*
package com.neeti.training.bean;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class TrainingDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "trainingName",nullable = false)
    private String trainingName;

    @ManyToOne()
    @JoinColumn(name = "departmentKey", referencedColumnName = "departmentKey")
    private Department department;

    //@ManyToOne()
    //@JoinColumn(name = "subDepartmentKey", referencedColumnName = "subDepartmentKey")
    //private SubDepartment subDepartment;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "startOn")
    private LocalDate startOn;

    @Column(name = "endOn")
    private LocalDate endOn;

    @Column(name = "status")
    private String status;

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

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
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
    }
*//*

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public LocalDate getStartOn() {
        return startOn;
    }

    public void setStartOn(LocalDate startOn) {
        this.startOn = startOn;
    }

    public LocalDate getEndOn() {
        return endOn;
    }

    public void setEndOn(LocalDate endOn) {
        this.endOn = endOn;
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
*/
