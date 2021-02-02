package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WaybillInvoiceQueryIstd;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.invoice.istdwaybill.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-20 11:38:39
 */
public class AlipayCommerceLogisticsInvoiceIstdwaybillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7575418116693359696L;

	/** 
	 * 开票的整体结果，0：处理中 1：已开票  2：开票失败
	 */
	@ApiField("status")
	private Long status;

	/** 
	 * 即时配送运单列表
	 */
	@ApiListField("waybill_invoices")
	@ApiField("waybill_invoice_query_istd")
	private List<WaybillInvoiceQueryIstd> waybillInvoices;

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

	public void setWaybillInvoices(List<WaybillInvoiceQueryIstd> waybillInvoices) {
		this.waybillInvoices = waybillInvoices;
	}
	public List<WaybillInvoiceQueryIstd> getWaybillInvoices( ) {
		return this.waybillInvoices;
	}

}
