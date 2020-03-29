package com.smart.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.delivery.models.Farmer;

public interface LoginRepository extends JpaRepository<Farmer, Integer>{

}
