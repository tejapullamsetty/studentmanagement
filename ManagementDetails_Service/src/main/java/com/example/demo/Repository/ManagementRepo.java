package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.ManagementDetails;


@Repository
public interface ManagementRepo extends JpaRepository<ManagementDetails, Integer> {

//	public void update(ManagementDetails m);

	
	
//	
//	
//	
//	updateManagementDeptById,deleteManagementByID

	
}
