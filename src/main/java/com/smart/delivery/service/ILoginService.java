package com.smart.delivery.service;

import java.util.List;

import com.smart.delivery.models.Farmer;

public interface ILoginService {

	public List<Farmer> getAllFarmers();
	public Farmer getFarmersById(int id);
	public void saveOrUpdate(Farmer farmers);
	public void delete(int id);
	public void update(Farmer farmers, int farmerId);
}
