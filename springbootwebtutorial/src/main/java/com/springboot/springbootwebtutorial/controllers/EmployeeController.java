package com.springboot.springbootwebtutorial.controllers;

import com.springboot.springbootwebtutorial.dto.EmployeeDTO;
import com.springboot.springbootwebtutorial.entities.EmployeeEntity;
import com.springboot.springbootwebtutorial.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    /*@GetMapping("/getSecretMessage")
    public String getSecretMessage() {
        return "Secret Message: Hello World!";
    }*/

    final private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/{id}")
    public EmployeeEntity getEmployeeById(@PathVariable Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<EmployeeEntity> getEmployeesSortBy(@RequestParam(required = false) String sortBy,
                                   @RequestParam(required = false) String age) {
        return employeeRepository.findAll();
    }

    @PostMapping("/addEmployee")
    public EmployeeEntity addEmployee(@RequestBody EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }
}
