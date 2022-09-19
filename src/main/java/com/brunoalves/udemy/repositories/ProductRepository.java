package com.brunoalves.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoalves.udemy.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
