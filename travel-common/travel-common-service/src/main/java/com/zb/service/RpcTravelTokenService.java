package com.zb.service;

import com.zb.pojo.Userinfo;

public interface RpcTravelTokenService {

    public String gengeratToken(String userAgentString, Userinfo userinfo);


    public void saveToken(String token, Userinfo user);

}
