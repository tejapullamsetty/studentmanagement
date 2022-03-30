package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="studentid")	
private Integer studentid;
	@Column(name="studentname")
private String	studentname;
	@Column(name="studentmark")
private Integer	studentmark;
	@Column(name="studentaddress")
private String	studentaddress;


public Student()
{
	
}

public Student(Integer studentid, String studentname, Integer studentmark, String studentaddress) {
	super();
	this.studentid = studentid;
	this.studentname = studentname;
	this.studentmark = studentmark;
	this.studentaddress = studentaddress;
}

public Integer getStudentid() {
	return studentid;
}
public void setStudentid(Integer studentid) {
	this.studentid = studentid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public Integer getStudentmark() {
	return studentmark;
}
public void setStudentmark(Integer studentmark) {
	this.studentmark = studentmark;
}
public String getStudentaddress() {
	return studentaddress;
}
public void setStudentaddress(String studentaddress) {
	this.studentaddress = studentaddress;
}


}
