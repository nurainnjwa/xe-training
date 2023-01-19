package com.xeTraining.orderservice.service;

import com.xeTraining.orderservice.entity.Order;
import com.xeTraining.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository repository;

    public List<Order> getOrder(){
        return repository.findAll();
    }

    public void deleteOrder(Long id){
        repository.findById(id).orElseThrow(
                () -> new RuntimeException("Not found")
        );
        repository.deleteById(id);
    }

    public Order updateOrder(Order order){
        repository.findById(order.getId()).orElseThrow(
                () -> new RuntimeException("Not found")
        );
        return repository.save(order);
    }
}
