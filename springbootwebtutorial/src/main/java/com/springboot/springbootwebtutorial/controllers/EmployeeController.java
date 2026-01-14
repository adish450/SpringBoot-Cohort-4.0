package com.springboot.springbootwebtutorial.controllers;

import com.springboot.springbootwebtutorial.dto.EmployeeDTO;
import com.springboot.springbootwebtutorial.entities.EmployeeEntity;
import com.springboot.springbootwebtutorial.services.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    /*@GetMapping("/getSecretMessage")
    public String getSecretMessage() {
        return "Secret Message: Hello World!";
    }*/

    final private EmployeeService employeeService;
    final private ModelMapper modelMapper;

    public EmployeeController(EmployeeService employeeService, ModelMapper modelMapper) {
        this.employeeService = employeeService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable Long id) {
        return modelMapper.map(employeeService.findById(id), EmployeeDTO.class);
    }

    @GetMapping
    public List<EmployeeDTO> getEmployeesSortBy(@RequestParam(required = false) String sortBy,
                                   @RequestParam(required = false) String age) {
        List<EmployeeEntity> employees = employeeService.findAll();
        return employees.stream().map(employee -> modelMapper.map(employee, EmployeeDTO.class)).toList();
    }

    @PostMapping("/addEmployee")
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employee) {
        return modelMapper.map(employeeService.save(modelMapper.map(employee, EmployeeEntity.class)), EmployeeDTO.class);
    }
}
