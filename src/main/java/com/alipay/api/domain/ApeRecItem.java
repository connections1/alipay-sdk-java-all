package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐item
 *
 * @author auto create
 * @since 1.0, 2022-06-16 19:33:13
 */
public class ApeRecItem extends AlipayObject {

	private static final long serialVersionUID = 3745174625885628771L;

	/**
	 * 物品id
	 */
	@ApiField("id")
	private String id;

	/**
	 * item的打分
	 */
	@ApiField("score")
	private String score;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

}
