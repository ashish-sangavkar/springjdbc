package com.springjdbc.springjdbc.annotation.service;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.springjdbc.annotation.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	public JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertEmployee(Employee employee) {
		String query = "insert into employee (empId, empName, empCity) values(?, ?, ?)";
		int result = this.jdbcTemplate.update(query, employee.getEmpId(), employee.getEmpName(), employee.getEmpCity());
		return result;
	}

	@Override
	public int updatEmployee(Employee employee) {
		String query = "update employee set empName=?, empCity=? where empId=?";
		int result = this.jdbcTemplate.update(query, employee.getEmpName(), employee.getEmpCity(), employee.getEmpId());
		return result;
	}

	@Override
	public int deleteEmployee(int empId) {
		String query = "delete from employee where empId=?";
		int result = this.jdbcTemplate.update(query, empId);
		return result;
	}

	@Override
	public Employee getOneEmployee(int empId) {
		String query = "select * from employee where empId=?";
		EmpRowMapperImpl empRowMapperImpl = new EmpRowMapperImpl();
		Employee employee = this.jdbcTemplate.queryForObject(query, empRowMapperImpl, empId);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		String query  = "select * from employee";
		List<Employee> employees = this.jdbcTemplate.query(query, new EmpRowMapperImpl());
		return employees;
	}

}
