package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot根据人脸图片查询人脸唯一序号
 *
 * @author auto create
 * @since 1.0, 2022-06-08 14:21:48
 */
public class AlipayOpenIotmbsFacedbCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4863528986152195558L;

	/**
	 * 人脸ID
	 */
	@ApiField("face_id")
	private String faceId;

	/**
	 * 人脸图片数据
	 */
	@ApiField("face_image")
	private String faceImage;

	/**
	 * 手机号码
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 项目ID
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 设备sn号
	 */
	@ApiField("sn")
	private String sn;

	public String getFaceId() {
		return this.faceId;
	}
	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}

	public String getFaceImage() {
		return this.faceImage;
	}
	public void setFaceImage(String faceImage) {
		this.faceImage = faceImage;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
