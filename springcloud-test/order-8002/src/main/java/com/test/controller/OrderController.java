package com.test.controller;

import com.test.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Object getOrderById(@PathVariable("id")String id){
        return orderService.getOrderById(1);
    }

    @RequestMapping(value = "/getlist",method = RequestMethod.GET)
    public Object getOrderList(){
        return orderService.getOrderList();
    }
}
