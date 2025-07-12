package com.employee_menegament.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee_menegament.entities.Employee;
import com.employee_menegament.service.EmployyeService;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployyeService employyeService;
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		
		return employyeService.addEmployee(employee);
	}

	@GetMapping
	public List<Employee> getAllEmployee() {
		
		return employyeService.getAllEmployee();
	}
	
	@GetMapping("/{empId}")
	public Employee getEmployee(@PathVariable long empId) {
		
		return employyeService.getEmployee(empId);
	}
	
	
	@PutMapping("/{empId}")
	public Employee updateEmployee(@PathVariable long empId , @RequestBody Employee employee) {
		
		return employyeService.updateEmployee(empId,employee);
	}
	
	@GetMapping("/address/{id}")
	public Employee getEmployeeAddressyById(@PathVariable long id) {
		
		return employyeService.findEmployeeByAddressId(id);
	}
	
	@GetMapping("/getEmployee/{firstName}")
	public Employee getEmployeeByFirstName(@PathVariable String firstName) {
		
		return employyeService.findEmployeeByFirstName(firstName);
	}
	
	@GetMapping("/getEmployeeAddress/{city}")
	public Employee getEmployeeAddressyByCity(@PathVariable String city) {
		
		return employyeService.findEmployeeByAddressCity(city);
	}
	
	
	

}
