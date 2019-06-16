package com.zhu.commonapi.service;

import com.zhu.commonapi.bean.Order;
import com.zhu.commonapi.config.OrderFallBackFanctory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "ORDER" ,fallbackFactory = OrderFallBackFanctory.class)
public interface OrderService {
    @RequestMapping("/get/{id}")
    Order getOrderById(@PathVariable("id") Integer id);
    @RequestMapping("/getOrderList")
    List<Order> getOrderList();
    @RequestMapping("/createOrder")
    void createOrder(Order order);

}
