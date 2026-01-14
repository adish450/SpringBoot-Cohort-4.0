package com.springboot.springbootwebtutorial.services;

import com.springboot.springbootwebtutorial.entities.EmployeeEntity;
import com.springboot.springbootwebtutorial.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    final private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeEntity findById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public List<EmployeeEntity> findAll() {
        return employeeRepository.findAll();
    }

    public EmployeeEntity save(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }
}
