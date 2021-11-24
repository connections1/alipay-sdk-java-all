package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加发票邮寄信息
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:25:27
 */
public class AlipayBossFncGfsettleprodInvoicemailinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4283998177877217986L;

	/**
	 * 邮寄信息
	 */
	@ApiField("invoice_mail_info_orde_dto")
	private InvoiceMailInfoOrderDTO invoiceMailInfoOrdeDto;

	public InvoiceMailInfoOrderDTO getInvoiceMailInfoOrdeDto() {
		return this.invoiceMailInfoOrdeDto;
	}
	public void setInvoiceMailInfoOrdeDto(InvoiceMailInfoOrderDTO invoiceMailInfoOrdeDto) {
		this.invoiceMailInfoOrdeDto = invoiceMailInfoOrdeDto;
	}

}
