package com.test.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.test.bean.Mechant;
import com.test.service.mechant.MechantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MechantController {

    @Autowired
    MechantService mechantService;
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod ="getError")
    public Object getMechant(@PathVariable("id") Integer id){
        if (id==6) {
            throw new RuntimeException();
        }
        Mechant mechant = new Mechant();
        mechant.setId(id);
        mechant.setMechantName("西瓜");
        return mechant;
    }

    @RequestMapping(value = "/get1/{id}",method = RequestMethod.GET)
    public Object getMechant1(@PathVariable("id") Integer id){
        if (id==7) {
            throw new RuntimeException();
        }
        Mechant mechant = new Mechant();
        mechant.setId(id);
        mechant.setMechantName("西瓜");
        return mechant;
    }
    public Object getError(@PathVariable("id") Integer id){
        Mechant mechant = new Mechant();
        mechant.setId(12345678);
        mechant.setMechantName("错误的商品");
        return mechant;
    }

}
