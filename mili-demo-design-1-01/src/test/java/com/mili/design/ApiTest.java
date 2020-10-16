package com.mili.design;

import com.mili.design.prize.IGoods;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ApiTest {

    @Test
    public void test_goods() throws Exception{
        PrizeFactory prizeFactory = new PrizeFactory();
        //1.优惠券
        IGoods service = prizeFactory.getService(1);
        service.sendGoods("100001","EGM13243434","2323324324",null);

        //2.兑换卡
        IGoods service2 = prizeFactory.getService(2);
        service2.sendGoods("100001","AFASDdafsda",null,null);

        //3。实物商品
        IGoods service1 = prizeFactory.getService(3);
        Map<String,String> extMap = new HashMap<String,String>();
        extMap.put("userName","米粒男孩");
        extMap.put("phone","1364554545");
        extMap.put("address","陕西省.....");
        service1.sendGoods("100001","3435453453","234234234",extMap);


    }
}
