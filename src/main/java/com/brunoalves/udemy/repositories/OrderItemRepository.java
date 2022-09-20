package com.brunoalves.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoalves.udemy.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
