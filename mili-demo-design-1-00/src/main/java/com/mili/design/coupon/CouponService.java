/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: CouponService
 * Author:   Administrator
 * Date:     2020/10/16 16:49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mili.design.coupon;

/**
 * 〈模拟发送优惠券〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2020/10/16
 * @since 1.0.0
 */
public class CouponService {

    public CouponResult sendCoupon(String uId,String couponNumber,String uuid){
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("000","发放成功");
    }
}
