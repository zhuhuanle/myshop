package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.bean.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @RequestMapping("/get")
    public Object getProduct(){
        Product product = new Product();
        product.setId(8003L);
        product.setProductName("service8003");
        return product;
    }
}
