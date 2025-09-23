package com.ironhack.Lab402_IntroToSpringBoot.model;

import jakarta.persistence.*;

import java.text.DateFormat;

@Entity
public class Patient {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Integer patient_id;

private String p_name;

private DateFormat p_dateOfBirth;


private Integer admitted_by;


public Patient() {
    }

    public Integer getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Integer patient_id) {
        this.patient_id = patient_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public DateFormat getP_dateOfBirth() {
        return p_dateOfBirth;
    }

    public void setP_dateOfBirth(DateFormat p_dateOfBirth) {
        this.p_dateOfBirth = p_dateOfBirth;
    }

    public Integer getAdmitted_by() {
        return admitted_by;
    }

    public void setAdmitted_by(Integer admitted_by) {
        this.admitted_by = admitted_by;
    }



}
