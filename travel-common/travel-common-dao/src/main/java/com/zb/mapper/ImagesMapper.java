package com.zb.mapper;
import com.zb.pojo.Images;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ImagesMapper {

	public Images getImagesById(@Param(value = "id") Long id)throws Exception;

	public List<Images>	getImagesListByMap(Map<String,Object> param)throws Exception;

	public Integer getImagesCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertImages(Images images)throws Exception;

	public Integer updateImages(Images images)throws Exception;

	public Integer deleteImagesById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteImages(Map<String,List<String>> params);

}
