package com.zhuzi.pay.controller;

import com.zhuzi.pay.dao.model.CollectFees;
import com.zhuzi.pay.service.AliPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author:hemingzhu
 * @Date:2018/12/10 11:01
 * @ProjectName: Pay
 * @Package: com.zhuzi.pay.controller
 * @ClassName: ZFBController
 * @UpdateUser:
 * @UpdateDate: 2018/12/10 11:01
 */
@RestController
@RequestMapping(value = "pay/zfb/test")
public class ZFBController {

    @Autowired
    private AliPayService aliPayService;

    /**
     * PC网页支付
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "pcPay", method = RequestMethod.POST)
    public void pcPay(@RequestBody CollectFees product) {
        System.out.println("PC网页支付！！！");
        String username = "zhuzi";
        product.setZffs("Z"); //支付方式
        product.setU_id("0");//用户id
        product.setJylx("W"); //交易类型
        product.setTransdate(new Date());
        product.setOpenid("");
        String form = null;
        aliPayService.aliPayPc(product);

    }


}
