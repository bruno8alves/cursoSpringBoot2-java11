package com.brunoalves.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoalves.udemy.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
