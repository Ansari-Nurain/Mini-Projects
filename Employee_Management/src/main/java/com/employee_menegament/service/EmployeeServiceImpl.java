package com.employee_menegament.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee_menegament.entities.Employee;
import com.employee_menegament.repository.AddressRepository;
import com.employee_menegament.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployyeService{
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	
	@Override
	public Employee addEmployee(Employee employee) {

		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {

		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmployee(long empId) {
		
		Employee employee = employeeRepo.findById(empId).orElse(null);
		if(employee==null) {
			throw new RuntimeException("Employee not found");
		}

		return employee;
	}

	@Override
	public Employee updateEmployee(long empId, Employee employee) {

		Employee employee2 = employeeRepo.findById(empId).orElse(null);
		
		if(employee2.getEmpId()==empId) {
			employee2.setFirstName(employee.getFirstName());
			employee2.setLastName(employee.getLastName());
		}
		
		return employeeRepo.save(employee2);
	}

	@Override
	public Employee findEmployeeByAddressId(long id) {

		return employeeRepo.findEmployeeByAddressId(id);
	}

	@Override
	public Employee findEmployeeByFirstName(String firstName) {

		return employeeRepo.findEmployeeByFirstName(firstName);
	}

	@Override
	public Employee findEmployeeByAddressCity(String city) {

		return employeeRepo.findEmployeeByAddressCity(city);
	}





}
