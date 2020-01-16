package com.entor.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * <p>
 * 
 * </p>
 *
 * @author Willis
 * @since 2020-01-07
 */
public class VipUser implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 会员信息主键
	 */
	@TableId(type = IdType.ASSIGN_UUID)
	private String vipUserId;

	/**
	 * 会员账号
	 */
	private String username;

	/**
	 * 会员密码
	 */
	private String password;

	/**
	 * 会员姓名
	 */
	private String name;

	/**
	 * 会员电话
	 */
	private String phone;

	/**
	 * 会员地址
	 */
	private String address;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	public String getVipUserId() {
		return vipUserId;
	}

	public void setVipUserId(String vipUserId) {
		this.vipUserId = vipUserId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "VipUser{" + "vipUserId=" + vipUserId + ", username=" + username + ", password=" + password + ", name="
				+ name + ", phone=" + phone + ", address=" + address + ", createTime=" + createTime + "}";
	}
}
