package com.nagarro.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.springboot.model.Availability;
import com.nagarro.springboot.repository.AvailabilityRepository;

@RestController
@CrossOrigin
public class AvailabilityController {
	
	@Autowired
	AvailabilityRepository repo;
	
	@RequestMapping("/availability/{id}/{code}")
	public List<Availability> getID(@PathVariable("id") int id, @PathVariable("code") int code)
	{
		return repo.findByPidAndPincodes(id,code);

	}

}
