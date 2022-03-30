package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.ManagementDetails;
import com.example.demo.Service.ManagementService;


@RestController
@RequestMapping("/management")
public class ManagementController {

	
	@Autowired
	private ManagementService service;
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<ManagementDetails> findAll(){
		return service.findAll();
	}
	
	@RequestMapping(value = "/findbyid/{id}", method = RequestMethod.GET)
	public ManagementDetails findById(@PathVariable("id") int id) {
		return service.findById(id);
	}
	
	@RequestMapping(value = "/deletebyid/{id}", method = RequestMethod.DELETE)
	public String deletbyid(@PathVariable int id) {
		String msg="";
		if(service.findById(id) != null) {
			service.delete(id);
			
			msg = "deleted success";
		} else {
			msg = "No Data Found";
		}
		return msg;
		
	}
	
//	public String updateManagement(@RequestBody ManagementDetails m) {
//		
//		service.update(m);
//		return "data updated";
//	}
//	
	
}
