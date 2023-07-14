package com.nagarro.springboot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.springboot.model.Users;
import com.nagarro.springboot.repository.UsersRepository;

@RestController
@CrossOrigin
public class UsersController {

	@Autowired 
	UsersRepository repo;
	
	@PostMapping(path="/users",consumes= {"application/json"})
	public boolean addUsers(@RequestBody Users user) 
	{
		repo.save(user);
		return true;
		
	}

	@RequestMapping("/users/{email}")
	public Optional<Users> getlogin(@PathVariable("email") String email)
	{
		return repo.findById(email);
	}

}
