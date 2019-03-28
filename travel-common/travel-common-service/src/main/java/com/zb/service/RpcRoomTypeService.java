package com.zb.service;

import com.zb.pojo.Roomtype;

import java.util.List;

public interface RpcRoomTypeService {
    public List<Roomtype> getRoomTypeList(Integer hotelId)throws Exception;
    public Integer updateRoomNum(Integer id,Integer roomNum);
}
