package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;


public interface StudentService  {
	
	public List<Student> getAllStudentDetails();
	public Student getAllStudentDetailsById(int id);

}
