package com.mkwinformatica.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkwinformatica.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{


}
