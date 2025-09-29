package com.ironhack.Lab402_IntroToSpringBoot.controller.interfaces;

import com.ironhack.Lab402_IntroToSpringBoot.model.Patient;
import com.ironhack.Lab402_IntroToSpringBoot.model.employee_STATUS;

import java.time.LocalDate;
import java.util.List;

public interface IntPatientController {
    List<Patient> getAllPatients();
    Patient getPatientById(Integer patient_id);
    List<Patient> getPatientsBirthdayBetween(LocalDate startP_dateOfBirth, LocalDate finishP_dateOfBirth);
    List<Patient> getPatientsByDeparment(String department);
    List<Patient> getPatientsByDoctorStatus (employee_STATUS status);
}
