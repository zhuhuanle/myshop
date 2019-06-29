package com.zhu.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhu.serviceImpl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderServiceImpl orderServiceImpl;

    @RequestMapping("/get/{id}")
    @HystrixCommand(fallbackMethod = "getOrderHy")
    public Object getOrder(@PathVariable("id") Integer id) {
        if (id == 5) {
            throw new RuntimeException();
        }
        return orderServiceImpl.getOrderById(id);
    }

    public Object getOrderHy(@PathVariable("id") Integer id) {
        return orderServiceImpl.getOrderById(99999999);
    }

}
