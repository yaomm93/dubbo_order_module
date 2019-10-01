package com.powerlbs.service.impl;

import com.powerlbs.domain.Order;
import com.powerlbs.service.OrderService;

import java.util.UUID;

/**
 * ClassName:${name}
 * package:com.powerlbs.service.impl
 *
 * @date:2019/9/28 12:20
 * @author:Yaoxiaoming
 **/
public class OrderServiceImpl implements OrderService {
    @Override
    public Order createOrder(Integer userId, String goodsName, float price, Integer amount) {
        Order order = new Order();
        String orderId = UUID.randomUUID().toString().replaceAll("-", "");
        order.setId(orderId);
        order.setGoodsName(goodsName);
        order.setPrice(price);
        order.setAmount(amount);
        return order;
    }
}
