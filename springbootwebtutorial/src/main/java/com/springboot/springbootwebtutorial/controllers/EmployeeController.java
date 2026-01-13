package com.springboot.springbootwebtutorial.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @GetMapping("/getSecretMessage")
    public String getEmployees() {
        return "Secret Message: Hello World!";
    }

    @GetMapping("/employees/{id}")
    public String getEmployeeById(@PathVariable Long id) {
        return "Employee with id: " + id;
    }

    @GetMapping("/employees")
    public String getEmployeesSortBy(@RequestParam(required = false) String sortBy,
    @RequestParam String age) {
        return "Employees sorted by: " + sortBy + " and age: " + age;
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody String employee) {
        return "Employee added: " + employee;
    }
}
