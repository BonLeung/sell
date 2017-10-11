package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by liangweibang on 2017/10/12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    private final String OPENID = "110110";

    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123457");
        orderMaster.setBuyerName("帮个");
        orderMaster.setBuyerPhone("18814142323");
        orderMaster.setBuyerAddress("纺织路东沙街");
        orderMaster.setOrderAmount(new BigDecimal(50));
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());

        OrderMaster result = repository.save(orderMaster);
        Assert.assertEquals("123457", result.getOrderId());
    }

    @Test
    public void findByBuyerOpenid() throws Exception {
        PageRequest pageRequest = new PageRequest(0, 1);
        Page<OrderMaster> orderMasterPage = repository.findByBuyerOpenid(OPENID, pageRequest);
        System.out.println(orderMasterPage.getTotalElements());
        Assert.assertNotEquals(0, orderMasterPage.getTotalElements());
    }

}