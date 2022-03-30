package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Entity.ManagementDetails;
import com.example.demo.Repository.ManagementRepo;

@Service
public class ManagementService {

	
	
	@Autowired
	private ManagementRepo deprepo;
	
	
	public List<ManagementDetails> findAll(){
		return deprepo.findAll();
	}
	
	public ManagementDetails findById(int id) {
		return deprepo.findById(id).get();
		
	}
	
	public void delete(int id) {
		deprepo.deleteById(id);
	}
	
//	public void update(ManagementDetails m) {
//		deprepo.update(m);
//	}
	
	
}
