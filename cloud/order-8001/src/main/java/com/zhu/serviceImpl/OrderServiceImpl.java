package com.zhu.serviceImpl;

import com.zhu.commonapi.bean.Order;
import com.zhu.commonapi.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public Order getOrderById(Integer id) {
        Order order = new Order();
        order.setId(id);
        return order;
    }

    @Override
    public List<Order> getOrderList() {
        return null;
    }

    @Override
    public void createOrder(Order order) {

    }
}
