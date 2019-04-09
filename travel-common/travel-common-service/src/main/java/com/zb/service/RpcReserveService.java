package com.zb.service;

import com.zb.pojo.Reserve;

import java.util.List;

public interface RpcReserveService {
    //预定信息添加
    public Integer insertReserve(Reserve reserve)throws Exception;
    //预定信息修改
    public Integer updateReserve(Reserve reserve)throws Exception;
    //根据Id查询预定信息
    public Reserve getReserveById(String id)throws Exception;
    //根据id修改预定信息状态
    public Integer updateStatusById(Integer status,String id)throws Exception;

    public List<Reserve> getReserveByPhone(String phone)throws Exception;
}
