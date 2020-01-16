package com.entor.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Willis
 * @since 2020-01-07
 */
public class Truck implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 货车id
     */
    @TableId("Truck_id")
    private String truckId;

    /**
     * 货车编号
     */
    @TableField("Truck_number")
    private String truckNumber;

    /**
     * 货车型号
     */
    @TableField("Truck_Model")
    private String truckModel;

    /**
     * 创建时间
     */
    private Date createTime;


    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public String getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(String truckNumber) {
        this.truckNumber = truckNumber;
    }

    public String getTruckModel() {
        return truckModel;
    }

    public void setTruckModel(String truckModel) {
        this.truckModel = truckModel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Truck{" +
        "truckId=" + truckId +
        ", truckNumber=" + truckNumber +
        ", truckModel=" + truckModel +
        ", createTime=" + createTime +
        "}";
    }
}
