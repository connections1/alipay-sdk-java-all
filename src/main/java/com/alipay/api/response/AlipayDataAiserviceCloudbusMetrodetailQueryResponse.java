package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MetroOdDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.metrodetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-10-21 10:35:26
 */
public class AlipayDataAiserviceCloudbusMetrodetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8879784995149144397L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private MetroOdDetailResult result;

	public void setResult(MetroOdDetailResult result) {
		this.result = result;
	}
	public MetroOdDetailResult getResult( ) {
		return this.result;
	}

}
