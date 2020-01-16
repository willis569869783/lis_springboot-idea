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
 * @since 2020-01-15
 */
public class Route implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 路线主键
     */
    @TableId("Route_id")
    private String routeId;

    /**
     * 路线名
     */
    @TableField("Route_name")
    private String routeName;

    /**
     * 价格
     */
    private Integer roitePrice;

    /**
     * 创建时间
     */
    private Date createTime;


    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public Integer getRoitePrice() {
        return roitePrice;
    }

    public void setRoitePrice(Integer roitePrice) {
        this.roitePrice = roitePrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Route{" +
        "routeId=" + routeId +
        ", routeName=" + routeName +
        ", roitePrice=" + roitePrice +
        ", createTime=" + createTime +
        "}";
    }
}
