package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.ManagementDetails;


@Repository
public interface ManagementRepo extends JpaRepository<ManagementDetails, Integer> {


	
}
