package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创意关联物料元素
 *
 * @author auto create
 * @since 1.0, 2021-09-17 10:08:24
 */
public class MaterialUnit extends AlipayObject {

	private static final long serialVersionUID = 8641947925662889478L;

	/**
	 * 创意元素C端渲染关联位置key值
	 */
	@ApiField("key")
	private String key;

	/**
	 * 创意图片/视频物料URL；标题/描述文本值
	 */
	@ApiField("material")
	private String material;

	/**
	 * 创意元素类型，IMG-图片；VIDEO-视频；TITLE-标题；DESC-描述
	 */
	@ApiField("type")
	private String type;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getMaterial() {
		return this.material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
