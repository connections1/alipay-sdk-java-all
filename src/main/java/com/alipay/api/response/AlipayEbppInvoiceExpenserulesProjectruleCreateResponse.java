package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.projectrule.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-12 09:44:39
 */
public class AlipayEbppInvoiceExpenserulesProjectruleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3416172274874844532L;

	/** 
	 * 项目id
	 */
	@ApiField("project_id")
	private String projectId;

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectId( ) {
		return this.projectId;
	}

}
