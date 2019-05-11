package com.rkatanor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rkatanor.model.Employee;
import com.rkatanor.service.EmployeeService;

@RestController
@RequestMapping(value = "/rest")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@GetMapping(value = "/saveemp")
	public String saveEntity() {
		Employee employee = new Employee();
		employee.setEid(100);
		employee.setFirstName("Rajkumar");
		employee.setLastName("Katanor");
		employee.setSsn("321-4444-22");
		employee.setAddress("LB Nagar");
		service.saveEmployee(employee);
		return "Employee object saved in DB";
	}

	@GetMapping(value = "getemployees")
	public List<Employee> getallemployess() {
		return service.getEmployees();
	}

}
