package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询模板详情
 *
 * @author auto create
 * @since 1.0, 2019-06-28 21:53:12
 */
public class AlipayMarketingVoucherTemplatedetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7173365475419562636L;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
