package com.rkatanor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rkatanor.dao.EmployeeDao;
import com.rkatanor.model.Employee;
import com.rkatanor.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao dao;

	@Override
	public void saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		dao.save(emp);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
