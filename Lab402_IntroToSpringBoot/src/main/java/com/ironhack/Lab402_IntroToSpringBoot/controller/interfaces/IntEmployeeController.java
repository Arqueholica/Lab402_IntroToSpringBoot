package com.ironhack.Lab402_IntroToSpringBoot.controller.interfaces;

import com.ironhack.Lab402_IntroToSpringBoot.model.Employee;
import com.ironhack.Lab402_IntroToSpringBoot.model.employee_STATUS;

import java.util.List;

public interface IntEmployeeController {

    List<Employee> getAllDoctors();
    Employee getDoctorById(Integer id);
    List<Employee> getDoctorByStatus(employee_STATUS status);
    List<Employee> getDoctorsByDepartment (String department);



}
