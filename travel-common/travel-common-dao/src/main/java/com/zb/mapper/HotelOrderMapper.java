package com.zb.mapper;

import com.zb.pojo.Hotel;
import com.zb.pojo.HotelOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HotelOrderMapper {

    public Integer insertHotelOrder(HotelOrder hotelOrder);

    public Integer updateHotelOrder(HotelOrder hotelOrder);

    public HotelOrder getHotelOrderById(@Param("orderId") String orderId);
}
