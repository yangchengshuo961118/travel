package com.zb.service;

import com.zb.pojo.Roomtype;

import java.util.List;

public interface RpcRoomTypeService {
    //获取所有房间类型
    public List<Roomtype> getRoomTypeList(Integer hotelId)throws Exception;
    //更改剩余房间数量
    public Integer updateRoomNum(Integer id,Integer roomNum) throws Exception;
    //根据id获取房间类型数据
    public Roomtype getRoomTypeByID(Integer id) throws Exception;
}
