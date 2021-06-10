package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee> allEmployees(){
		return repo.findAll();
	}
	
	public void saveEmployee(Employee employee) {
		repo.save(employee);
	}
	
	public Employee getEmployee(int id) {
		return repo.findById(id).get();
	}
	
	public void deleteEmployee(int id) {
		repo.deleteById(id);
	}
}
