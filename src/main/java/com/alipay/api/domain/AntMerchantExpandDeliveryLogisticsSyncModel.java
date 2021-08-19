package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流信息同步接口
 *
 * @author auto create
 * @since 1.0, 2020-09-14 20:31:59
 */
public class AntMerchantExpandDeliveryLogisticsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3361611261735561217L;

	/**
	 * 配送指令
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 物流信息
	 */
	@ApiField("logistics_info")
	private LogisticsInfo logisticsInfo;

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public LogisticsInfo getLogisticsInfo() {
		return this.logisticsInfo;
	}
	public void setLogisticsInfo(LogisticsInfo logisticsInfo) {
		this.logisticsInfo = logisticsInfo;
	}

}
