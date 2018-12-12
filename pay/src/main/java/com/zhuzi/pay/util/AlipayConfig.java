package com.zhuzi.pay.util;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;

/**
 * @ClassName AlipayConfig
 * @Author wangx
 * @Date 2018/8/22 8:58
 * @Vsersion 1.0
 * @Description 支付宝支付设置属性
 **/
public class AlipayConfig {
	// 支付宝网关名
	public static String OPEN_API_DOMAIN = "https://openapi.alipay.com/gateway.do";
	public static String MCLOUD_API_DOMAIN = "http://mcloudmonitor.com/gateway.do";

	public static String NOTIFY_URL = "http://wxjz.9zchina.com/hxjzparking2/mobile/paymentorder/wxpayNotify";// 测试服

	public static String RETURN_URL = "http://wxjz.9zchina.com/hxjzparking2/mobile/paymentorder/wxpayNotify";// 测试服

	/**
	 * 私有的默认构造子，保证外界无法直接实例化
	 */
	private AlipayConfig() {
	}

	;

	/**
	 * 签名方式
	 */
	public static String SIGN_TYPE = "RSA2";
	/**
	 * 参数类型
	 */
	public static String PARAM_TYPE = "json";
	/**
	 * 编码
	 */
	public static String CHARSET = "utf-8";

	/**
	 * 支付宝APP请求客户端实例
	 */
	public static AlipayClient getAlipayClient() {
		return new DefaultAlipayClient(OPEN_API_DOMAIN, getAppId(), getPrivateKey(), PARAM_TYPE, CHARSET, getAliPayPublicKey(), "RSA2");
	}

	// /**
	// * 电脑端预下单
	// */
	// public static AlipayTradeService getAlipayTradeService() {
	// return new AlipayTradeServiceImpl.ClientBuilder().build();
	// }

	// partnerId和appId
	public static String getPid() {
		return "2088102175803362";
	}

	public static String getAppId() {
		return "2017111709981394";
	}

	// RSA私钥、公钥和支付宝公钥
	public static String getPrivateKey() {
		return "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCT93D84xR6Qnj6y2SldSue6x2DqyfOrehSVA+GKK9DRcbYJe3Ha7WLp8JWJP8XMR97aW0xUIUQcu0FeA+6qZZJ+8kDt4cgEQlY0XAz6GfVN0NwPDsOjxT+wQXC8Z7Jck87Z1q+KM6uckW2HrqPxnf+52mtYcO/gmgaFYRHodltvaXSXKGlxBoOaXAdVRQfQLVJ6CDJS75KuGlwDk3bJoozneV2crHm+F0KEaLYBQa4ko+yyGVMI9A1M+gpQu9Iw62tf9+8KMnX6WblBIhK/vjpM3Zu/CruHCLjGEUGa9rHtF2J55U9fssSNRG2s4fyb8cL8z4YEeraMIHE6T6O4nVDAgMBAAECggEAAaxJjcJvh9ZakdNc5vYFMT3NTqDPyWlz+AJVTpoFKUiPr//1yUxxeAvEib7PV47JoVaW0njrmD0EawxpeR3TwjBjnHQlxfoLVgLANwYIroN6crlrnYWGoj7CdurOdc6iELThdMb3V0eZfC6qw1dmIe6x5jD1yqOJ08msfjbZQ4FeCKthWsbM0f36hLzNiV+6fBtVRskVNuv/egtS9O4kzDDIDbyphVC333JcfOD30jcs409TJWrwXzbUFStRIfEX8LbCvsHyKSESZ5TEFUVnWlyUYm9Ec2CXcUxitPf9axg8j6XZaadhF0EQXtoUIYrofQ4ClNfbYelZCK+H7V0K2QKBgQDGpDyvBjbaxn45lQoyq2qv3uXcoRwIzByO6nlMRoq8AXLgDxBeLnyckaXBOxl7A/vxw58WKR73dWMqXK6MNt7a/gY3whJVCcIIEM/NqEo80pc9jvdJWYRKLGWSh2yP0UaBdoyYaEkWRTk+xfGMLEe0o9Jwicbtlp5BMTxVezyKVwKBgQC+sUOGFrBHpOwSs13JjafGmQU+PixBEQS91RxvAm+tmv5etC25pQ3TEbu1p3jzSSVDmLfVnfrmg/pxGoUU5vnwHiG+8ecnZFtadSPqpPTHOYbj4d3htARjol/Hyxt9ByGgsXFsP7BwhcLzGV59zhbJhgM3qylmXpyirm153nRw9QKBgDtiDeIk8XEltcZxD8NmC1bYQ89ZOpBGtKLk5a4vyHm71SO2XSZKr2X/BJZnnI5x+nekC4MMd/1yUlrvqh6wqJ6/Igy5L9HMQP04SWcp0EeujRgSDUsYP7wM2bCcW5AC+Bjr38wQIQlPWHWzpypIcodGEjsidR3B0T2cAnVrigWxAoGAHY8+51c3BjQTgCabwDWcL1XjES30EDYCJScW3EJla2TeT3HgsKlcRj62eUc3oYbSJvNSc+OkU/1bYhL5VC8lyUnyczXuXhXZb2E/Kw1dAFDzjvmhOm58S7GM5VyfqzbiyJUY/u20fQzPFn31Ps0mjSCf+Q4oQb0izLj7MWwBYs0CgYEAgeYpob+kH7iZ8cufqjr+3VMjePEmnJcS0U2dnpYkGtmktMgczSKfw0vlp+f+VT6hsCAKQu8bDp9oKJLl1gZOPjRlM3b14Rnza3I8miuPArLCAVYBlHShp4MM2CcdC44EGwKS+yVkSlwu/yi6O2+7TZEA1RYDAj8hXhJnMjqQzRs=";
	}

	public static String getPublicKey() {
		return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAk/dw/OMUekJ4+stkpXUrnusdg6snzq3oUlQPhiivQ0XG2CXtx2u1i6fCViT/FzEfe2ltMVCFEHLtBXgPuqmWSfvJA7eHIBEJWNFwM+hn1TdDcDw7Do8U/sEFwvGeyXJPO2davijOrnJFth66j8Z3/udprWHDv4JoGhWER6HZbb2l0lyhpcQaDmlwHVUUH0C1SeggyUu+SrhpcA5N2yaKM53ldnKx5vhdChGi2AUGuJKPsshlTCPQNTPoKULvSMOtrX/fvCjJ1+lm5QSISv746TN2bvwq7hwi4xhFBmvax7RdieeVPX7LEjURtrOH8m/HC/M+GBHq2jCBxOk+juJ1QwIDAQAB";
	}

	// SHA256withRsa对应支付宝公钥
	public static String getAliPayPublicKey() {
		return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA4QLzUiYDzGFn3JfvAQw9f5bL0Rnyw5Tyu+ujo+etiuX2Hx9m7fxK0tgPMwzW5tQgzd13ZYbRQ8chMpzHNFc4xJrI/Z4C3uWkBvfz2kqcJKbItkSHl/Ik2MG8VxfwUJxdXbPuDCGf0gliDs9guosWf1ACCgAKfQ/ZvDd6uf6fsZMFlYsySfiRaOCt+/+pmMaWC7yG/lWkrF4G4hVdn4QhHtSc9HPNgqT91+7w1Yg0hQsBbK5ExOp8AGo5BptIu+hk3X9qS34Ge33/ShVAlBtQ2wHUCA4CYS8EanscM2xHKeJ7I84IP1z24vOWeNtDoAdAIw6FTWasniwPoRGPp/anpQIDAQAB";
	}

	// 签名类型
	public static String getSignType() {
		return "RSA2";
	}

	// 当面付最大查询次数和查询间隔（毫秒）
	public static String getMaxQueryRetry() {
		return "5";
	}

	public static String getQueryDuration() {
		return "5000";
	}

	// 当面付最大撤销次数和撤销间隔（毫秒）
	public static String getMaxCancelRetry() {
		return "3";
	}

	public static String getCancelDuration() {
		return "2000";
	}

	// 交易保障线程第一次调度延迟和调度间隔
	public static String getHeartBeat() {
		return "5";
	}

	public static String getHeartBeatDuration() {
		return "900";
	}

}
