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
public class Driver implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 司机主键                                                     
     */
    private String driverId;

    /**
     * 司机姓名
     */
    private String driverName;

    /**
     * 司机电话兼账号
     */
    private String phone;

    /**
     * 司机密码
     */
    private String password;

    /**
     * 驾照
     */
    private String drivingLicense;

    /**
     * 角色编号
     */
    private String roleId;

    /**
     * 创建时间
     */
    private Date createTime;


    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Driver{" +
        "driverId=" + driverId +
        ", driverName=" + driverName +
        ", phone=" + phone +
        ", password=" + password +
        ", drivingLicense=" + drivingLicense +
        ", roleId=" + roleId +
        ", createTime=" + createTime +
        "}";
    }
}
