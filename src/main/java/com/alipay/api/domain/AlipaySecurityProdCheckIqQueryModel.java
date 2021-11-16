package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校验
 *
 * @author auto create
 * @since 1.0, 2019-09-17 17:03:19
 */
public class AlipaySecurityProdCheckIqQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2521982722611571153L;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

}
