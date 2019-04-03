package com.zb.service;
import com.zb.dto.Page;
import com.zb.pojo.Hotel;

import java.util.Map;

public interface RpcHotelService {
    //分页查询酒店
    public Page<Hotel> getHotelListByMap(Integer beginPos,Integer pageSize)throws Exception;
    //添加酒店信息
    public Integer insertHotelMap(Hotel hotel) throws Exception;
    //更改酒店信息
    public Integer updateHotelMap(Hotel hotel)throws Exception;
    //根据酒店Id查询酒店信息
    public Hotel getHotelById(Integer id)throws Exception;
}
