package com.springjdbc.springjdbc.xml.service;

import java.util.List;

import com.springjdbc.springjdbc.xml.Student;

public interface StudentService {
	
	public int insertStudent(Student student);
	public int updateStudent(Student student);
	public int deleteStudent(int studId);
	public Student displayOneStudent(int studId);
	public List<Student> displayAllStudents();
}
