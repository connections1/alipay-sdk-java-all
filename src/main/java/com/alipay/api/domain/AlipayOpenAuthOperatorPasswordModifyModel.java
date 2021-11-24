package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改蚂蚁操作员登录密码
 *
 * @author auto create
 * @since 1.0, 2020-09-28 10:23:44
 */
public class AlipayOpenAuthOperatorPasswordModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5153333923714415559L;

	/**
	 * 新的密码
	 */
	@ApiField("new_password")
	private String newPassword;

	/**
	 * 操作员
	 */
	@ApiField("operator")
	private OperatorQuery operator;

	/**
	 * 指定租户ID，新增值需联系蚂蚁操作员operator团队人工处理
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getNewPassword() {
		return this.newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public OperatorQuery getOperator() {
		return this.operator;
	}
	public void setOperator(OperatorQuery operator) {
		this.operator = operator;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
