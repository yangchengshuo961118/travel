package com.zb.service;

import com.zb.pojo.Userinfo;

public interface RpcUserInfoService {
    public Integer updateUserinfo(Userinfo userinfo)throws Exception;

    public Integer addNewUser(Userinfo userinfo)throws Exception;

    public Userinfo getUserinfoById(Integer userId)throws Exception;
}
