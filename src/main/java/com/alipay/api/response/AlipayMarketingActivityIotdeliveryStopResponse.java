package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.iotdelivery.stop response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-01 16:56:52
 */
public class AlipayMarketingActivityIotdeliveryStopResponse extends AlipayResponse {

	private static final long serialVersionUID = 7841399125668995671L;

	/** 
	 * 投放计划id
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getDeliveryId( ) {
		return this.deliveryId;
	}

}
