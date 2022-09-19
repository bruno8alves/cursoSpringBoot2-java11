package com.brunoalves.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoalves.udemy.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
