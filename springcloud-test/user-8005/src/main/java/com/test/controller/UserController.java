package com.test.controller;

import com.test.bean.Mechant;
import com.test.service.mechant.MechantService;
import com.test.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {


    @Autowired
    OrderService orderService;

    @Autowired
    MechantService mechantService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Object getList(){
        return orderService.getOrderList();
    }

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Object getOrder(@PathVariable("id")Integer id){
        Mechant mechantById=null;
        try {
            mechantById= mechantService.getMechantById(id);
        } catch (Exception e) {
            System.out.println(e);
        }
        return mechantById;
    }
}
