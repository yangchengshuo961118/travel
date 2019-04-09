package com.zb.service;

import com.zb.pojo.Userinfo;

public interface RpcUserLoginService {
    public Userinfo getUserLogin(String phone, String password) throws Exception;

    /**
     * 根据token 返回当前用户对象
     * @param token
     * @return
     * @throws Exception
     */
    public Userinfo getCurrUser(String token) throws Exception;
}
