package com.zb.service;

import com.zb.pojo.Images;

import java.util.List;

public interface RpcImagesService {
    public List<Images> getImagesByImagesId(Integer imagesId)throws Exception;

    public Integer insertImagesByImagesId(Images images)throws Exception;


}
