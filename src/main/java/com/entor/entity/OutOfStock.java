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
public class OutOfStock implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 出库id
     */
    @TableId("Out_of_stock_id")
    private String outOfStockId;

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
     * 送货司机
     */
    private String driverTruckId;

    /**
     * 创建时间
     */
    private Date createTime;


    public String getOutOfStockId() {
        return outOfStockId;
    }

    public void setOutOfStockId(String outOfStockId) {
        this.outOfStockId = outOfStockId;
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
        return "OutOfStock{" +
        "outOfStockId=" + outOfStockId +
        ", warehouseId=" + warehouseId +
        ", goodsId=" + goodsId +
        ", driverTruckId=" + driverTruckId +
        ", createTime=" + createTime +
        "}";
    }
}
