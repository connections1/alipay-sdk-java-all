package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 餐饮pos业务订单支付结果查询
 *
 * @author auto create
 * @since 1.0, 2018-04-14 17:41:14
 */
public class KoubeiCateringOrderPayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7764864546949312391L;

	/**
	 * 外部支付订单号,唯一标识本次支付的requestID
	 */
	@ApiField("out_pay_no")
	private String outPayNo;

	/**
	 * pos业务订单外部主键信息
	 */
	@ApiField("pos_order_key")
	private PosOrderKey posOrderKey;

	public String getOutPayNo() {
		return this.outPayNo;
	}
	public void setOutPayNo(String outPayNo) {
		this.outPayNo = outPayNo;
	}

	public PosOrderKey getPosOrderKey() {
		return this.posOrderKey;
	}
	public void setPosOrderKey(PosOrderKey posOrderKey) {
		this.posOrderKey = posOrderKey;
	}

}
