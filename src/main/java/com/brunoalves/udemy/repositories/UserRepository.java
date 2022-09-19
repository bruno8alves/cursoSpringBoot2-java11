package com.brunoalves.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoalves.udemy.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
