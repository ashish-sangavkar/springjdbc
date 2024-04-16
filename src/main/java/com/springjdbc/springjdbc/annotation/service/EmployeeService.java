package com.springjdbc.springjdbc.annotation.service;

import java.util.List;

import com.springjdbc.springjdbc.annotation.Employee;
import com.springjdbc.springjdbc.xml.Student;

public interface EmployeeService {
	
	public int insertEmployee(Employee employee);
	public int updatEmployee(Employee employee);
	public int deleteEmployee(int empId);
	public Employee getOneEmployee(int empId);
	public List<Employee> getAllEmployee();

}
