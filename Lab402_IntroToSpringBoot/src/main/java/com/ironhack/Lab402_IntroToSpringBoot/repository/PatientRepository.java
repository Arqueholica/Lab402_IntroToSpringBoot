package com.ironhack.Lab402_IntroToSpringBoot.repository;

import com.ironhack.Lab402_IntroToSpringBoot.model.Patient;
import com.ironhack.Lab402_IntroToSpringBoot.model.employee_STATUS;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
    List<Patient> findByAllPatients();
    List<Patient> findByIdPatient(Integer patient_id);
    List<Patient> findByP_dateOfBirthBetween(LocalDate startP_dateOfBirth, LocalDate finishP_dateOfBirth);
    List<Patient> findByAdmitted_byDepartment(String department);
    List<Patient> findByAdmitted_byStatus(employee_STATUS status);
}
