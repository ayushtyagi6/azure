package com.nagarro.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.springboot.model.Users;

public interface UsersRepository extends JpaRepository<Users,String> {

}
