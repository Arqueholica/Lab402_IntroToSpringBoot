package com.ironhack.Lab402_IntroToSpringBoot.repository;

import com.ironhack.Lab402_IntroToSpringBoot.model.Employee;
import com.ironhack.Lab402_IntroToSpringBoot.model.employee_STATUS;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> { ;
    Optional<Employee> findDoctorById(Integer employee_id);
    List<Employee> findByStatus(employee_STATUS status);
    List<Employee> findByDepartment(String department);



}
