package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OperatorBasicInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.operator.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-14 16:34:53
 */
public class AlipayOpenAuthOperatorInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8532184593691279488L;

	/** 
	 * 操作员基础信息
	 */
	@ApiField("operator_info")
	private OperatorBasicInfo operatorInfo;

	public void setOperatorInfo(OperatorBasicInfo operatorInfo) {
		this.operatorInfo = operatorInfo;
	}
	public OperatorBasicInfo getOperatorInfo( ) {
		return this.operatorInfo;
	}

}
