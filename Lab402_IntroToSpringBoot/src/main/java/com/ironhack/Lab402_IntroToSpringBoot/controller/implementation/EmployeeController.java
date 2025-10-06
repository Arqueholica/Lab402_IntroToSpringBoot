package com.ironhack.Lab402_IntroToSpringBoot.controller.implementation;

import com.ironhack.Lab402_IntroToSpringBoot.controller.interfaces.IntEmployeeController;
import com.ironhack.Lab402_IntroToSpringBoot.model.Employee;
import com.ironhack.Lab402_IntroToSpringBoot.model.employee_STATUS;
import com.ironhack.Lab402_IntroToSpringBoot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/doctors")

public class EmployeeController implements IntEmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("")
    public List<Employee> getAllDoctors() {
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Employee getDoctorById(@PathVariable(name= "id") Integer id) {
        Optional<Employee> employeeOptional = employeeRepository.findDoctorById(id);
        if(employeeOptional.isEmpty()) return null;

        Employee myEmployee = employeeOptional.get();
        return myEmployee;
    }

    @GetMapping("/{status}")
    public List<Employee> getDoctorByStatus(@PathVariable(name = "status") employee_STATUS status) {
        return employeeRepository.findByStatus(status);
    }

    @GetMapping("/{department}")
    public List<Employee> getDoctorsByDepartment(@PathVariable(name = "department") String department) {
        return employeeRepository.findByDepartment(department);
    }
}
