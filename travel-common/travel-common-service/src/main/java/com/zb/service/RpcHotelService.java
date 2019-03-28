package com.zb.service;
import com.zb.dto.Page;
import com.zb.pojo.Hotel;

import java.util.Map;

public interface RpcHotelService {
    public Page<Hotel> getHotelListByMap(Integer beginPos,Integer pageSize)throws Exception;

    public Integer insertHotelMap(Map<String,Object> map) throws Exception;

    public Integer updateHotelMap(Map<String,Object> map)throws Exception;
}
