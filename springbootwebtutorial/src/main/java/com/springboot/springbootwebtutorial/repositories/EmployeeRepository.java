package com.springboot.springbootwebtutorial.repositories;

import com.springboot.springbootwebtutorial.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity /*Entity*/, Long /*type of Id*/> {
}
