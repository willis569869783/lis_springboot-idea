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
public class Power implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 权限主键
     */
    private String powerId;

    /**
     * 权限名
     */
    private String powerName;


    public String getPowerId() {
        return powerId;
    }

    public void setPowerId(String powerId) {
        this.powerId = powerId;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    @Override
    public String toString() {
        return "Power{" +
        "powerId=" + powerId +
        ", powerName=" + powerName +
        "}";
    }
}
