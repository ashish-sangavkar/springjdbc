package com.springjdbc.springjdbc.xml.service;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import com.springjdbc.springjdbc.xml.Student;

import com.springjdbc.springjdbc.xml.Student;

import com.springjdbc.springjdbc.xml.*;
public class StudentServiceImpl implements StudentService{
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertStudent(Student student) {
		String query = "insert into student (studId, studName, studCity) values (?, ?, ?)";
		int result = this.jdbcTemplate.update(query, student.getStudId(), student.getStudName(), student.getStudCity());
		return result;
	}
	
	@Override
	public int updateStudent(Student student) {
		String query = "update student set studName=?, studCity=? where studId=?";;
		int result = this.jdbcTemplate.update(query, student.getStudName(), student.getStudCity(), student.getStudId());
		return result;
	}

	@Override
	public int deleteStudent(int studId) {
		String query = "delete from student where studId=?";
		int result = this.jdbcTemplate.update(query, studId);
		return result;
	}

	@Override
	public Student displayOneStudent(int studId) {
		String query = "select * from student where studId=?";
		RowMapperImpl rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studId);
		return student;
	}

	@Override
	public List<Student> displayAllStudents() {
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}

	
}
