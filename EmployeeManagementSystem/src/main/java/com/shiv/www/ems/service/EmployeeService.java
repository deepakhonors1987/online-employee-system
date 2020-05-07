package com.shiv.www.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiv.www.ems.entity.Employee;
import com.shiv.www.ems.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public void getEmployeeById() {
		List<Employee> employee = employeeRepository.findAll();
		for (Employee employee2 : employee) {
			System.out.println(employee2);
		}
	}
}
