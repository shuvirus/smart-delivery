package com.smart.delivery.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.delivery.models.Farmer;
import com.smart.delivery.repository.LoginRepository;

@Service
public class FarmerLoginService implements ILoginService {

	@Autowired  
	LoginRepository loginRepository;  

	@Override
	public List<Farmer> getAllFarmers()   
	{  
		List<Farmer> farmers = new ArrayList<Farmer>();  
		loginRepository.findAll().forEach(farmer -> farmers.add(farmer));  
		return farmers;  
	}  
	//getting a specific record by using the method findById() of CrudRepository 
	@Override
	public Farmer getFarmersById(int id)   
	{  
		return loginRepository.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	@Override
	public void saveOrUpdate(Farmer farmers)   
	{  
		loginRepository.save(farmers);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	@Override
	public void delete(int id)   
	{  
		loginRepository.deleteById(id);  
	}  
	//updating a record  
	@Override
	public void update(Farmer farmers, int farmerId)   
	{  
		loginRepository.save(farmers);  
	}  
}
