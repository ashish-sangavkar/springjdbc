package com.springjdbc.springjdbc.xml;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.springjdbc.xml.service.StudentServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/springjdbc/xml/config.xml");
        
        StudentServiceImpl studentServiceImpl = (StudentServiceImpl) context.getBean("studentServiceImpl");
        
        Student student = (Student) context.getBean("student");
        
//        int result = studentServiceImpl.insertStudent(student);
//        System.out.println(result+" rows inserted...");
        
//          int result = studentServiceImpl.updateStudent(student);
//          System.out.println(result+" rows updated...");
        
//      int result = studentServiceImpl.deleteStudent(student.getStudId());
//      System.out.println(result+" rows deleted...");
        
//        Student student1 = studentServiceImpl.displayOneStudent(102);
//        System.out.println(student1);
        
        List<Student> students = studentServiceImpl.displayAllStudents();
        
        for(Student s:students) {
        	System.out.println(s);
        }
    }
}
