package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职得工作证岗位收集
 *
 * @author auto create
 * @since 1.0, 2022-06-28 17:00:03
 */
public class ZhimaCustomerJobworthPositionAddModel extends AlipayObject {

	private static final long serialVersionUID = 7222176784799135588L;

	/**
	 * 职位信息
	 */
	@ApiField("jobworth_position_info")
	private JobWorthPositionInfo jobworthPositionInfo;

	public JobWorthPositionInfo getJobworthPositionInfo() {
		return this.jobworthPositionInfo;
	}
	public void setJobworthPositionInfo(JobWorthPositionInfo jobworthPositionInfo) {
		this.jobworthPositionInfo = jobworthPositionInfo;
	}

}
