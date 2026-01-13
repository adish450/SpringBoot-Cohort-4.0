package com.springboot.springbootwebtutorial.controllers;

import com.springboot.springbootwebtutorial.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    /*@GetMapping("/getSecretMessage")
    public String getSecretMessage() {
        return "Secret Message: Hello World!";
    }*/

    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable Long id) {
        return new EmployeeDTO(id, "John", "", 25, LocalDate.now(), true);
    }

    @GetMapping
    public String getEmployeesSortBy(@RequestParam(required = false) String sortBy,
    @RequestParam String age) {
        return "Employees sorted by: " + sortBy + " and age: " + age;
    }

    @PostMapping("/addEmployee")
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employee) {
        employee.setId(100L);
        return employee;
    }
}
