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
public class DriverTruck implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 司机使用货车id
     */
    private String driverTruckId;

    /**
     * 货车id
     */
    private String truckId;

    /**
     * 司机id
     */
    private String driverId;

    /**
     * 创建时间
     */
    private Date createTime;


    public String getDriverTruckId() {
        return driverTruckId;
    }

    public void setDriverTruckId(String driverTruckId) {
        this.driverTruckId = driverTruckId;
    }

    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "DriverTruck{" +
        "driverTruckId=" + driverTruckId +
        ", truckId=" + truckId +
        ", driverId=" + driverId +
        ", createTime=" + createTime +
        "}";
    }

}
