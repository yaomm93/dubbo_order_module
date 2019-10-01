package com.powerlbs.service;

import com.powerlbs.domain.Order;

/**
 * ClassName:${name}
 * package:com.powerlbs.service
 *
 * @date:2019/9/28 12:15
 * @author:Yaoxiaoming
 **/
public interface OrderService {
    //用户的id,商品名称，单价，数量
    public Order createOrder(Integer userId,
                             String goodName, float price, Integer amount);
}
