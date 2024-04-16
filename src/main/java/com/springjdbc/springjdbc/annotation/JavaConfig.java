package com.springjdbc.springjdbc.annotation;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springjdbc.springjdbc.annotation.service.EmpRowMapperImpl;
import com.springjdbc.springjdbc.annotation.service.EmployeeServiceImpl;

@Configuration
public class JavaConfig {
	
	@Bean(name="employee")
	public Employee getStudent() {
		Employee employee = new Employee();
		employee.setEmpId(101);
		employee.setEmpName("Sir Adam KS Bharat Gilkilist");
		employee.setEmpCity("Test Cricket");
		return employee;
	}
	
	@Bean(name="dataSource")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/springDB");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("");
		return driverManagerDataSource;
	}
	
	@Bean(name="jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean(name="employeeServiceImpl")
	public EmployeeServiceImpl getEmployeeServiceImpl() {
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		employeeServiceImpl.setJdbcTemplate(getJdbcTemplate());
		return employeeServiceImpl;
	}
}
