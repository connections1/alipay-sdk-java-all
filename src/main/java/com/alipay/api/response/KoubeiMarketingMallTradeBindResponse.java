package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.mall.trade.bind response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-22 00:36:52
 */
public class KoubeiMarketingMallTradeBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 3331125953244686794L;

	/** 
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

}
