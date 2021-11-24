package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解绑微信公众号跳转支付宝url接口
 *
 * @author auto create
 * @since 1.0, 2021-11-19 11:14:06
 */
public class AlipayCommerceOperationIsvQrcodeUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 3176483454359681223L;

	/**
	 * 微信公众号二维码码值
	 */
	@ApiField("qrcode_url")
	private String qrcodeUrl;

	public String getQrcodeUrl() {
		return this.qrcodeUrl;
	}
	public void setQrcodeUrl(String qrcodeUrl) {
		this.qrcodeUrl = qrcodeUrl;
	}

}
