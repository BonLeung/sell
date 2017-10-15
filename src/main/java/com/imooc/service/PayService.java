package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * 支付
 * Created by liangweibang on 2017/10/15.
 */
public interface PayService {

    void create(OrderDTO orderDTO);

}
