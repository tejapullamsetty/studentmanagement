package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	public StudentService service;
	
	@GetMapping("/findAll")
	public List<Student> getAllStudentDetails()
	{
		return service.getAllStudentDetails();
	}
	
	@GetMapping("/findAllById")
	public Student getAllStudentDetailsById(int id)
	{
		return service.getAllStudentDetailsById(id);
		
	}

}
