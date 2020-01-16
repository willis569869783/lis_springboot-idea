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
public class Warehouse implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 仓库主键
     */
    @TableId("Warehouse_id")
    private String warehouseId;

    /**
     * 库存id
     */
    @TableField("Stock_id")
    private String stockId;

    /**
     * 仓库名
     */
    @TableField("Warehouse_name")
    private String warehouseName;

    /**
     * 仓库地址
     */
    @TableField("Warehouse_address")
    private String warehouseAddress;

    /**
     * 仓库状态0（可入库）1（仓库已满）
     */
    @TableField("Warehouse_state")
    private Integer warehouseState;

    /**
     * 仓库管理员
     */
    @TableField("Warehouse_staff_id")
    private String warehouseStaffId;

    /**
     * 创建时间
     */
    private Date createTime;


    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }

    public Integer getWarehouseState() {
        return warehouseState;
    }

    public void setWarehouseState(Integer warehouseState) {
        this.warehouseState = warehouseState;
    }

    public String getWarehouseStaffId() {
        return warehouseStaffId;
    }

    public void setWarehouseStaffId(String warehouseStaffId) {
        this.warehouseStaffId = warehouseStaffId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
        "warehouseId=" + warehouseId +
        ", stockId=" + stockId +
        ", warehouseName=" + warehouseName +
        ", warehouseAddress=" + warehouseAddress +
        ", warehouseState=" + warehouseState +
        ", warehouseStaffId=" + warehouseStaffId +
        ", createTime=" + createTime +
        "}";
    }
}
