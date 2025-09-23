package com.ironhack.Lab402_IntroToSpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

import java.util.List;

@Entity

public class Employee {
@Id
private Integer employee_id;

private String department;
private String e_name;

@Enumerated(EnumType.STRING)
private employee_STATUS status;

private List<Patient> patientList;



public Employee() {
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public employee_STATUS getStatus() {
        return status;
    }

    public void setStatus(employee_STATUS status) {
        this.status = status;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
}
