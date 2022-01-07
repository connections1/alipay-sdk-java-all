package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IOT云打印服务
 *
 * @author auto create
 * @since 1.0, 2021-04-09 15:06:54
 */
public class AlipayCommerceIotPrintmodelPrintSendModel extends AlipayObject {

	private static final long serialVersionUID = 2571481979528581218L;

	/**
	 * 服务调用上下文
	 */
	@ApiField("context")
	private ServiceModelContext context;

	/**
	 * 打印服务调用内容
	 */
	@ApiField("print_message")
	private PrintMessageVO printMessage;

	public ServiceModelContext getContext() {
		return this.context;
	}
	public void setContext(ServiceModelContext context) {
		this.context = context;
	}

	public PrintMessageVO getPrintMessage() {
		return this.printMessage;
	}
	public void setPrintMessage(PrintMessageVO printMessage) {
		this.printMessage = printMessage;
	}

}
