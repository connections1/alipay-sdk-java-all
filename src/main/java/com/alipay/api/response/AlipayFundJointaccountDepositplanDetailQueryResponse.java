package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FundPlanDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.depositplan.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-20 13:14:48
 */
public class AlipayFundJointaccountDepositplanDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6712359451341625217L;

	/** 
	 * 资金计划列表
	 */
	@ApiListField("fund_plan_list")
	@ApiField("fund_plan_d_t_o")
	private List<FundPlanDTO> fundPlanList;

	public void setFundPlanList(List<FundPlanDTO> fundPlanList) {
		this.fundPlanList = fundPlanList;
	}
	public List<FundPlanDTO> getFundPlanList( ) {
		return this.fundPlanList;
	}

}
