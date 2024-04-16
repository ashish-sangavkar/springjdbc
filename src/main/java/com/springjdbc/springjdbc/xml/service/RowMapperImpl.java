package com.springjdbc.springjdbc.xml.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.springjdbc.xml.Student;

public class RowMapperImpl implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setStudId(rs.getInt(1));
		student.setStudName(rs.getString(2));
		student.setStudCity(rs.getString(3));
		return student;
	}

}
