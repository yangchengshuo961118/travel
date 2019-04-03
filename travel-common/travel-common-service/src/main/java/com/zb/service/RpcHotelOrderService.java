package com.zb.service;

import com.zb.pojo.HotelOrder;

public interface RpcHotelOrderService {

    public Integer insertHotelOrder(HotelOrder hotelOrder) throws Exception;

    public Integer updateHotelOrder(HotelOrder hotelOrder) throws Exception;

    public HotelOrder getHotelOrderById(String orderId)throws Exception;
}
