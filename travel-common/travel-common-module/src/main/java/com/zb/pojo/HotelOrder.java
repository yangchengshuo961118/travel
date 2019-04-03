package com.zb.pojo;

import java.io.Serializable;

public class HotelOrder implements Serializable {
    private String orderId;
    private Integer orderStatus;
    private Double orderPrice;
    private Double cashPledge;
    private String roomType;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Double getCashPledge() {
        return cashPledge;
    }

    public void setCashPledge(Double cashPledge) {
        this.cashPledge = cashPledge;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
}
