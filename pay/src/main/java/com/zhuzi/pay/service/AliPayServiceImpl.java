package com.zhuzi.pay.service;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.zhuzi.pay.dao.model.CollectFees;
import com.zhuzi.pay.util.AlipayConfig;
import com.zhuzi.pay.util.WXPayUtil;
import org.springframework.stereotype.Service;

/**
 * @Author:hemingzhu
 * @Date:2018/12/11 17:37
 * @ProjectName: Pay
 * @Package: com.zhuzi.pay.service
 * @ClassName: AliPayServiceImpl
 * @UpdateUser:
 * @UpdateDate: 2018/12/11 17:37
 */
@Service
public class AliPayServiceImpl implements AliPayService {
    @Override
    public void aliPayPc(CollectFees product) throws AlipayApiException {

        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
//        alipayRequest.setReturnUrl(AlipayConfig.RETURN_URL);//前台通知
//        alipayRequest.setNotifyUrl(AlipayConfig.NOTIFY_URL);//后台回调
        JSONObject bizContent = new JSONObject();
        String trade_no = product.getJylx() + WXPayUtil.getCustNo();
        product.setTransid(trade_no);
        bizContent.put("out_trade_no", trade_no);
        bizContent.put("total_amount", product.getPayment());//订单金额:元
        bizContent.put("subject", product.getPlateNumber());//订单标题
        bizContent.put("seller_id", AlipayConfig.getPid());//实际收款账号，一般填写商户PID即可
        bizContent.put("product_code", "FAST_INSTANT_TRADE_PAY");//电脑网站支付
        bizContent.put("body", product.getPlateNumber());
        String biz = bizContent.toString().replaceAll("\"", "'");
        alipayRequest.setBizContent(biz);
        AlipayConfig.getAlipayClient().pageExecute(alipayRequest).getBody();

    }
}
