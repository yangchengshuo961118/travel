package com.zb.mapper;
import com.zb.pojo.Userinfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserinfoMapper {

	public Userinfo getUserinfoById(@Param(value = "id") Long id)throws Exception;

	public List<Userinfo>	getUserinfoListByMap(Map<String,Object> param)throws Exception;

	public Integer getUserinfoCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertUserinfo(Userinfo userinfo)throws Exception;

	public Integer updateUserinfo(Userinfo userinfo)throws Exception;

	public Integer deleteUserinfoById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteUserinfo(Map<String,List<String>> params);

}
