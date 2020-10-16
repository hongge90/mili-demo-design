/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: GoodsService
 * Author:   Administrator
 * Date:     2020/10/16 16:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mili.design.goods;

import com.alibaba.fastjson.JSON;

/**
 * 〈模拟实物商品服务〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2020/10/16
 * @since 1.0.0
 */
public class GoodsService {

    public Boolean sendgoods(DeliverReq req){
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}
