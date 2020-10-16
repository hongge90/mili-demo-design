/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: CouponGoodsService
 * Author:   Administrator
 * Date:     2020/10/16 16:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mili.design.prize.impl;

import com.alibaba.fastjson.JSON;
import com.mili.design.coupon.CouponResult;
import com.mili.design.coupon.CouponService;
import com.mili.design.prize.IGoods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 〈兑换优惠券〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2020/10/16
 * @since 1.0.0
 */
public class CouponGoodsService implements IGoods {

    private Logger logger = LoggerFactory.getLogger(CouponGoodsService.class);

    private CouponService couponService = new CouponService();
    @Override
    public void sendGoods(String uId, String goodsId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId, goodsId, bizId);
        logger.info("请求参数[优惠券] => uId：{} goodsId：{} bizId：{} extMap：{}", uId, goodsId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
        if(!"0000".equals(couponResult.getCode())){
            throw new RuntimeException(couponResult.getInfo());
        }
    }
}
