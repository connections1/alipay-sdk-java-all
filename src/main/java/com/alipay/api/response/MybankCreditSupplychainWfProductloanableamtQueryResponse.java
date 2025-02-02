package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.McaStoreLoanableDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.wf.productloanableamt.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-18 15:16:59
 */
public class MybankCreditSupplychainWfProductloanableamtQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2467566283113356777L;

	/** 
	 * 可贷额度列表
	 */
	@ApiListField("storeloanablelist")
	@ApiField("mca_store_loanable_detail")
	private List<McaStoreLoanableDetail> storeloanablelist;

	public void setStoreloanablelist(List<McaStoreLoanableDetail> storeloanablelist) {
		this.storeloanablelist = storeloanablelist;
	}
	public List<McaStoreLoanableDetail> getStoreloanablelist( ) {
		return this.storeloanablelist;
	}

}
