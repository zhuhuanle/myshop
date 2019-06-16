package com.zhu.controller;

import com.zhu.commonapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/get/{id}")
    public Object getUser(@PathVariable("id") Integer id){
        return orderService.getOrderById(id);
    }

}
