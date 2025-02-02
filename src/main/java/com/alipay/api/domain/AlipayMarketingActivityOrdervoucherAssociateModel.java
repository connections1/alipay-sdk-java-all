package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关联订单信息
 *
 * @author auto create
 * @since 1.0, 2022-07-17 18:31:59
 */
public class AlipayMarketingActivityOrdervoucherAssociateModel extends AlipayObject {

	private static final long serialVersionUID = 3744643323938397928L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 外部业务单号，用作幂等控制。 幂等作用： 参数不变的情况下，再次请求返回与上一次相同的结果。 外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝支付下单时的商户订单号，欲与该商家券关联的支付宝支付
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 商家券券码。
限制:
券码必须已发放给用户。
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getVoucherCode() {
		return this.voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

}
