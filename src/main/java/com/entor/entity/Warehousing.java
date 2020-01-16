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
public class Warehousing implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 入库id
     */
    @TableId("Warehousing_id")
    private String warehousingId;

    /**
     * 仓库id
     */
    @TableField("Warehouse_id")
    private String warehouseId;

    /**
     * 货物id
     */
    private String goodsId;

    /**
     * 送货司机中间表id
     */
    private String driverTruckId;

    /**
     * 创建时间
     */
    private Date createTime;


    public String getWarehousingId() {
        return warehousingId;
    }

    public void setWarehousingId(String warehousingId) {
        this.warehousingId = warehousingId;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getDriverTruckId() {
        return driverTruckId;
    }

    public void setDriverTruckId(String driverTruckId) {
        this.driverTruckId = driverTruckId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Warehousing{" +
        "warehousingId=" + warehousingId +
        ", warehouseId=" + warehouseId +
        ", goodsId=" + goodsId +
        ", driverTruckId=" + driverTruckId +
        ", createTime=" + createTime +
        "}";
    }
}
