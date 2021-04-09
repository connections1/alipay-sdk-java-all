package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlegalchain.multiparty.apply response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-04 15:21:37
 */
public class AlipayBossProdAntlegalchainMultipartyApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5264779171811784148L;

	/** 
	 * 法链业务ID,用于查询上链状态
	 */
	@ApiField("bas_data_id")
	private String basDataId;

	public void setBasDataId(String basDataId) {
		this.basDataId = basDataId;
	}
	public String getBasDataId( ) {
		return this.basDataId;
	}

}
