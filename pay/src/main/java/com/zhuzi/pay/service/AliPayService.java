package com.zhuzi.pay.service;

import com.alipay.api.AlipayApiException;
import com.zhuzi.pay.dao.model.CollectFees;

/**
 * @Author:hemingzhu
 * @Date:2018/12/10 11:08
 * @ProjectName: Pay
 * @Package: com.zhuzi.pay.service
 * @ClassName: AliPayService
 * @UpdateUser:
 * @UpdateDate: 2018/12/10 11:08
 */
public interface AliPayService {
    void aliPayPc(CollectFees product) throws AlipayApiException;
}
