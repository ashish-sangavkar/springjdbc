package com.springjdbc.springjdbc.annotation.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.springjdbc.annotation.*;
public class EmpRowMapperImpl implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmpId(rs.getInt(1));
		employee.setEmpName(rs.getString(2));
		employee.setEmpCity(rs.getString(3));
		return employee;
	}

}
