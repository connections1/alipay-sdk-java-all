package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO模板的基本信息配置
 *
 * @author auto create
 * @since 1.0, 2022-07-18 11:35:49
 */
public class ZMGOBasicConfig extends AlipayObject {

	private static final long serialVersionUID = 1483185743588289154L;

	/**
	 * 商户在芝麻GO配置的业务身份编码
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 运营商商户支付宝ID。若非ISV代理模式，也就是商户自运营模式，此属性取值与partner_id一致。
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 外部业务单号，供幂等使用，需保证每次请求的值都不同
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户的支付宝ID，即为此商户创建芝麻GO模板
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 芝麻GO模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
