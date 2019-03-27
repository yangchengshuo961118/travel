package com.zb.service;
import com.zb.dto.Page;
import com.zb.pojo.Hotel;

import java.util.Map;

public interface RpcHotelService {
    public Page<Hotel> getHotelListByMap( Map<String,Object> map)throws Exception;
}
