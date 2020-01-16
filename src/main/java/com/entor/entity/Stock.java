package com.entor.entity;

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
public class Stock implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 库存id
     */
    @TableId("Stock_id")
    private String stockId;

    /**
     * 库存容量
     */
    @TableField("Stock_capacity")
    private String stockCapacity;


    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getStockCapacity() {
        return stockCapacity;
    }

    public void setStockCapacity(String stockCapacity) {
        this.stockCapacity = stockCapacity;
    }

    @Override
    public String toString() {
        return "Stock{" +
        "stockId=" + stockId +
        ", stockCapacity=" + stockCapacity +
        "}";
    }
}
