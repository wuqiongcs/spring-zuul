package com.wuqiong.springcloud.order.controller;

import com.wuqiong.springcloud.order.feign.UserFeignService;
import com.wuqiong.springcloud.order.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/")
public class OrderController {
    @Autowired
    private UserFeignService userFeignService;

    @RequestMapping("getOrderById")
    public Object getOrderById(@RequestParam("id")Integer id){
        Order order = new Order();
        order.setId(1);
        order.setOrderNo("121555566555");
        order.setUserId(1);
        String username = userFeignService.getUserNameById(1);
        order.setUsername(username);

        return order;
    }



}
