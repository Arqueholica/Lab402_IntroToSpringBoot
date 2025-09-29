package com.ironhack.Lab402_IntroToSpringBoot.controller.implementation;

import com.ironhack.Lab402_IntroToSpringBoot.controller.interfaces.IntPatientController;
import com.ironhack.Lab402_IntroToSpringBoot.model.Patient;
import com.ironhack.Lab402_IntroToSpringBoot.model.employee_STATUS;

import java.time.LocalDate;
import java.util.List;

public class PatientController implements IntPatientController {
    @Override
    public List<Patient> getAllPatients() {
        return List.of();
    }

    @Override
    public Patient getPatientById(Integer patient_id) {
        return null;
    }

    @Override
    public List<Patient> getPatientsBirthdayBetween(LocalDate startP_dateOfBirth, LocalDate finishP_dateOfBirth) {
        return List.of();
    }

    @Override
    public List<Patient> getPatientsByDeparment(String department) {
        return List.of();
    }

    @Override
    public List<Patient> getPatientsByDoctorStatus(employee_STATUS status) {
        return List.of();
    }
}
