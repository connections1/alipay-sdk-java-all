package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.alipaypoint.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-02 14:15:16
 */
public class AlipayUserAlipaypointSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3492515751452929547L;

	/** 
	 * 发放记录号
	 */
	@ApiField("record_id")
	private String recordId;

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

}
