package com.example.gccoffee.repository;

import com.example.gccoffee.model.Email;
import com.example.gccoffee.model.Order;
import com.example.gccoffee.model.Product;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.Collections;
import java.util.Optional;

public interface OrderRepository {
    Order insert(Order order);
    Order update(Order order);
    Optional<Order> findByEmail(Email email);
}
