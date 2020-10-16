/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: CardGoodsService
 * Author:   Administrator
 * Date:     2020/10/16 16:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mili.design.prize.impl;

import com.alibaba.fastjson.JSON;
import com.mili.design.card.CardService;
import com.mili.design.prize.IGoods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 〈兑换第三方虚拟卡〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2020/10/16
 * @since 1.0.0
 */
public class CardGoodsService implements IGoods{
    private Logger logger = LoggerFactory.getLogger(CardGoodsService.class);
    //模拟注入
    private CardService cardService = new CardService();

    @Override
    public void sendGoods(String uId, String goodsId, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uId);
        cardService.grantToken(mobile,bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} goodsId：{} bizId：{} extMap：{}", uId, goodsId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }

    private String queryUserMobile(String uId) {
        return "15333333331";
    }
}
