package com.example.SpringbootAngular.Controller;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringbootAngular.Models.Employee;
import com.example.SpringbootAngular.Repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200/")
public class EployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		//System.out.println("hii");
		
		return employeeRepository.findAll();
	}
	public Employee addEmployee(@RequestBody Employee emp) {
		Employee save = employeeRepository.save(emp);
		return save;
		
	}
	
}
