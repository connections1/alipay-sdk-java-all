package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.advertising.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-02 11:11:18
 */
public class KoubeiMarketingAdvertisingCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5112133246991173268L;

	/** 
	 * 创建广告唯一标识
	 */
	@ApiField("ad_id")
	private String adId;

	public void setAdId(String adId) {
		this.adId = adId;
	}
	public String getAdId( ) {
		return this.adId;
	}

}
