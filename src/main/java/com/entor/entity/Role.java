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
public class Role implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 角色主键
     */
    private String roleId;

    /**
     * 角色名称
     */
    private String name;


    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
        "roleId=" + roleId +
        ", name=" + name +
        "}";
    }
}
