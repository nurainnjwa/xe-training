package com.xeTraining.orderservice.controller;

import com.xeTraining.orderservice.entity.Order;
import com.xeTraining.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demo")
public class OrderController {

    @Autowired
    OrderService service;

    private Order order = new Order();

    @GetMapping("/OrderList")
    public List<Order> getList(){
        return service.getOrder();
    }

    @GetMapping("/delete{id}")
    public void deleteOrder(@PathVariable(value = "id")long id){
        service.deleteOrder(id);
    }

    @PutMapping("/update/{id}")
    public Order updateWizardInfo(@RequestBody Order order){
        return service.updateOrder(order);
    }
}
