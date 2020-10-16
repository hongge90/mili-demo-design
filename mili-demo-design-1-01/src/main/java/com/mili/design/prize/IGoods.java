package com.mili.design.prize;

import com.sun.activation.registries.MailcapParseException;

import java.util.Map;

/**
 * @author 鲁坚红
 * @version V1.0
 * @Package com.mili.design.prize
 * @date 2020/10/16 16:28
 * @Copyright © 2019
 */
public interface IGoods {
   public void sendGoods(String uId, String goodsId, String bizId, Map<String,String > extMap) throws Exception;
}
