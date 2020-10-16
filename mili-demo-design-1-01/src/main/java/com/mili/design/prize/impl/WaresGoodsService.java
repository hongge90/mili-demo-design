/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: WaresGoodsService
 * Author:   Administrator
 * Date:     2020/10/16 16:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mili.design.prize.impl;

import com.alibaba.fastjson.JSON;
import com.mili.design.goods.DeliverReq;
import com.mili.design.goods.GoodsService;
import com.mili.design.prize.IGoods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 〈兑换实物商品〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2020/10/16
 * @since 1.0.0
 */
public class WaresGoodsService  implements IGoods{

    private Logger logger = LoggerFactory.getLogger(WaresGoodsService.class);

    private GoodsService goodsService = new GoodsService();
    @Override
    public void sendGoods(String uId, String goodsId, String bizId, Map<String, String> extMap) throws Exception {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(uId));
        deliverReq.setUserPhone(queryUserPhoneNumber(uId));
        deliverReq.setSku(goodsId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));

        Boolean isSuccess = goodsService.sendgoods(deliverReq);

        logger.info("请求参数[实物] => uId：{} goodsId：{} bizId：{} extMap：{}", uId, goodsId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[实物]：{}", isSuccess);
        if (!isSuccess) throw new RuntimeException("实物商品发放失败");

    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }
}
