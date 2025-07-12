package com.employee_menegament.service;

import java.util.List;

import com.employee_menegament.entities.Employee;

public interface EmployyeService {
	
	public Employee addEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();
	
	public Employee getEmployee(long empId);
	
	public Employee updateEmployee(long empId, Employee employee);
	
	public Employee findEmployeeByAddressId(long id);

	public Employee findEmployeeByFirstName(String firstName);

	public Employee findEmployeeByAddressCity(String city);

	
	

}
