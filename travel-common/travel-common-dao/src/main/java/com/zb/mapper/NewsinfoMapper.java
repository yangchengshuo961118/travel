package com.zb.mapper;
import com.zb.pojo.Newsinfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NewsinfoMapper {

	public Newsinfo getNewsinfoById(@Param(value = "id") Long id)throws Exception;

	public List<Newsinfo>	getNewsinfoListByMap(Map<String,Object> param)throws Exception;

	public Integer getNewsinfoCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertNewsinfo(Newsinfo newsinfo)throws Exception;

	public Integer updateNewsinfo(Newsinfo newsinfo)throws Exception;

	public Integer deleteNewsinfoById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteNewsinfo(Map<String,List<String>> params);

}
