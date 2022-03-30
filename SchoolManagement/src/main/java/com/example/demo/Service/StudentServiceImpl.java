package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	public StudentRepository studentrepo;

	
	public List<Student> getAllStudentDetails()
	{
		return studentrepo.findAll();
	}
	
	public Student getAllStudentDetailsById(int id)
	{
		Optional<Student> op= studentrepo.findById(id);
		if(op.isPresent())
		{
			return op.get();
		}
		else
		{
			return null;
		}
	}

}
