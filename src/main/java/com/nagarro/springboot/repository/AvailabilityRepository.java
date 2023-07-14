package com.nagarro.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.springboot.model.Availability;

public interface AvailabilityRepository extends JpaRepository<Availability, Integer>{
	
	List<Availability> findByPidAndPincodes(int id ,int code);

}
