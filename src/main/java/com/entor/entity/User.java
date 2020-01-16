package com.entor.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Willis
 * @since 2020-01-07
 */
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 普通用户主键
     */
    private String userId;

    /**
     * 普通用户姓名
     */
    private String name;

    /**
     * 普通用户电话
     */
    private String phone;

    /**
     * 普通用户地址
     */
    private String address;

    /**
     * 创建时间
     */
    private Date createTime;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
        return "User{" +
        "userId=" + userId +
        ", name=" + name +
        ", phone=" + phone +
        ", address=" + address +
        ", createTime=" + createTime +
        "}";
    }
}
