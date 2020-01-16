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
public class Emp implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 员工主键
     */
    private String empId;

    /**
     * 员工姓名
     */
    private String empName;

    /**
     * 员工性别(1男0女)
     */
    private Integer sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 电话号码兼账号
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 角色编号
     */
    private String roleId;

    /**
     * 创建时间
     */
    private Date createTime;


    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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
        return "Emp{" +
        "empId=" + empId +
        ", empName=" + empName +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", phone=" + phone +
        ", password=" + password +
        ", roleId=" + roleId +
        ", createTime=" + createTime +
        "}";
    }
}
