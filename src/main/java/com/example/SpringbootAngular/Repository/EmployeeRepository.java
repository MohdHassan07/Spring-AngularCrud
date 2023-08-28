package com.example.SpringbootAngular.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringbootAngular.Models.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
