package com.entor.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Willis
 * @since 2020-01-07
 */
public class RolePower implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 角色权限主键
     */
    private String rolePower;

    /**
     * 角色id
     */
    private String roleId;

    /**
     * 权限id
     */
    private String power;


    public String getRolePower() {
        return rolePower;
    }

    public void setRolePower(String rolePower) {
        this.rolePower = rolePower;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "RolePower{" +
        "rolePower=" + rolePower +
        ", roleId=" + roleId +
        ", power=" + power +
        "}";
    }
}
