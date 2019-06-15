package com.test.service;

import com.test.bean.Order;
import com.test.mapper.OrderMapper;
import com.test.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class orderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public Order getOrderById(Integer id) {
        return orderMapper.selectById(1);
    }

    @Override
    public List<Order> getOrderList() {
        List<Order> list = new ArrayList<>();
        list.add(orderMapper.selectById(1));
        return list;
    }

    @Override
    public Integer addOrder(Order order) {
        return null;
    }
}
