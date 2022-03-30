package com.futurefocus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.futurefocus.entity.Student;

public  interface StudentDao extends JpaRepository<Student,Integer> {

}
