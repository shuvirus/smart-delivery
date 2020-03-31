package com.smart.delivery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.smart.delivery.models.Farmer;
import com.smart.delivery.service.ILoginService;

@RestController
public class LoginController {

	@Autowired 
	ILoginService loginService;  
	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/farmers")  
	private List<Farmer> getAllFarmers()   
	{  
		System.out.println(" get Farmers : ");
		return loginService.getAllFarmers();  
	}  
	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/farmer/{Id}")  
	private Farmer getfarmers(@PathVariable("Id") int Id)   
	{  
		return loginService.getFarmersById(Id);  
	}  
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/farmer/{Id}")  
	private void deleteFarmer(@PathVariable("Id") int Id)   
	{  
		loginService.delete(Id);  
	}  
	//creating post mapping that post the book detail in the database  
	@PostMapping("/farmers")  
	private int saveFarmer(@RequestBody Farmer farmers)   
	{  
		System.out.println("farmer Details are : "+farmers.toString());
		loginService.saveOrUpdate(farmers);  
		return farmers.getId();  
	}  
	//creating put mapping that updates the book detail   
	@PutMapping("/farmers")  
	private Farmer update(@RequestBody Farmer farmers)   
	{  
		loginService.saveOrUpdate(farmers);  
		return farmers;  
	}  

	
}
