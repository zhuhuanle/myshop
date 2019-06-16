package com.zhu.commonapi.config;

import com.zhu.commonapi.bean.Order;
import com.zhu.commonapi.service.OrderService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderFallBackFanctory implements FallbackFactory<OrderService> {
    @Override
    public OrderService create(Throwable throwable) {
        return new OrderService() {
            @Override
            public Order getOrderById(Integer id) {
                Order order = new Order();
                order.setId(1111111111);
                order.setNum(1111111);
                return order;
            }

            @Override
            public List<Order> getOrderList() {
                return null;
            }

            @Override
            public void createOrder(Order order) {

            }
        };
    }
}
