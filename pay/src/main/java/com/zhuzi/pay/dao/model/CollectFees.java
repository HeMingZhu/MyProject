package com.zhuzi.pay.dao.model;



import java.util.Date;

/**
 * @author mzy
 * @date 2018-8-15 收费记录的实体类
 */
public class CollectFees {

	private String accid;// 收费id

	private Date transdate;// 交易时间

	private String transid;// 订单id

	private String ckid; // 车库id

	private Double payment;// 交易金额

	private String zffs;// 支付方式

	private String u_id;// 会员id

	private String plateNumber;// 车牌号

	private String tcsc;// 停车时长

	private String jylx;// 交易类型

	private String openid;// 微信账号的唯一标识

	private String operator;// 操作者

	private String jszt;// 结算状态 0交易进行中 1交易已完成 2交易已退款

	public String getJszt() {
		return jszt;
	}

	public void setJszt(String jszt) {
		this.jszt = jszt;
	}

	public String getAccid() {
		return accid;
	}

	public void setAccid(String accid) {
		this.accid = accid;
	}

	public String getTransid() {
		return transid;
	}

	public void setTransid(String transid) {
		this.transid = transid;
	}

	public String getCkid() {
		return ckid;
	}

	public void setCkid(String ckid) {
		this.ckid = ckid;
	}

	public Double getPayment() {
		return payment;
	}

	public void setPayment(Double payment) {
		this.payment = payment;
	}

	public String getZffs() {
		return zffs;
	}

	public void setZffs(String string) {
		this.zffs = string;
	}

	public String getTcsc() {
		return tcsc;
	}

	public void setTcsc(String tcsc) {
		this.tcsc = tcsc;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getJylx() {
		return jylx;
	}

	public void setJylx(String jylx) {
		this.jylx = jylx;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getTransdate() {
		return transdate;
	}

	public void setTransdate(Date transdate) {
		this.transdate = transdate;
	}
}