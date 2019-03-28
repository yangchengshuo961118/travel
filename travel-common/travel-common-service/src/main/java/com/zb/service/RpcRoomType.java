package com.zb.service;

import com.zb.pojo.Roomtype;

import java.util.List;

public interface RpcRoomType {
    public List<Roomtype> getRoomTypeList(Integer hotelId)throws Exception;
}
