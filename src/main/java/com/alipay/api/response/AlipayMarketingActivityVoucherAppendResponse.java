package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.voucher.append response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-18 15:57:10
 */
public class AlipayMarketingActivityVoucherAppendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5144213119997447263L;

	/** 
	 * 预充值链接
限制
1、有效时间3天
	 */
	@ApiField("recharge_url")
	private String rechargeUrl;

	public void setRechargeUrl(String rechargeUrl) {
		this.rechargeUrl = rechargeUrl;
	}
	public String getRechargeUrl( ) {
		return this.rechargeUrl;
	}

}
