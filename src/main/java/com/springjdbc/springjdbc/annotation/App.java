package com.springjdbc.springjdbc.annotation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.springjdbc.annotation.service.EmployeeServiceImpl;
import com.springjdbc.springjdbc.xml.Student;
import com.springjdbc.springjdbc.xml.service.StudentServiceImpl;

public class App 
{
	public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        
        EmployeeServiceImpl employeeServiceImpl = (EmployeeServiceImpl) context.getBean("employeeServiceImpl");
        
        Employee employee = (Employee) context.getBean("employee");
        
        int result = employeeServiceImpl.insertEmployee(employee);
        System.out.println(result+" rows inserted...");
        
//        int result = studentServiceImpl.updateStudent(student);
//        System.out.println(result+" rows updated...");
      
//        int result = studentServiceImpl.deleteStudent(student.getStudId());
//        System.out.println(result+" rows deleted...");
      
//        Student student1 = studentServiceImpl.displayOneStudent(102);
//        System.out.println(student1);
      
//        List<Student> students = studentServiceImpl.displayAllStudents();
//        for(Student s:students) {
//        	System.out.println(s);
//        }
        
    }
}

