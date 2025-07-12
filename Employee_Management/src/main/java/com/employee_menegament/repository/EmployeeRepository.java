package com.employee_menegament.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee_menegament.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	public Employee findEmployeeByAddressId(long id);
			
	public Employee findEmployeeByFirstName(String firstName);
	
	public Employee findEmployeeByAddressCity(String city);
	
	

}
