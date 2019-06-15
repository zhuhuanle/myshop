package com.test.service.order;

import com.test.bean.Order;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "ORDER-PROVID")
public interface OrderService {
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    Order getOrderById(@PathVariable("id") Integer id);
    @RequestMapping(value = "/getlist",method = RequestMethod.GET)
    List<Order> getOrderList();
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    Integer addOrder(Order order);

}
