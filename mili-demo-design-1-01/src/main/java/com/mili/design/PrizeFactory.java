/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: PrizeFactory
 * Author:   Administrator
 * Date:     2020/10/16 16:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mili.design;

import com.mili.design.prize.IGoods;
import com.mili.design.prize.impl.CardGoodsService;
import com.mili.design.prize.impl.CouponGoodsService;
import com.mili.design.prize.impl.WaresGoodsService;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/10/16
 * @since 1.0.0
 */
public class PrizeFactory {

    public IGoods getService(Integer commodityType){
        if (null == commodityType) return null;
        if (1 == commodityType) return new CardGoodsService();
        if (2 == commodityType) return new CouponGoodsService();
        if (3 == commodityType) return new WaresGoodsService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
