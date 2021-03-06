package com.example.demo.repo;

import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {





    Optional<Employee> findEmployeeById(Long id);


    Optional<Employee> findEmployeeByEmail(String email);
}
