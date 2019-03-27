package com.zb.mapper;
import com.zb.pojo.Customerinfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerinfoMapper {

	public Customerinfo getCustomerinfoById(@Param(value = "id") Long id)throws Exception;

	public List<Customerinfo>	getCustomerinfoListByMap(Map<String,Object> param)throws Exception;

	public Integer getCustomerinfoCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCustomerinfo(Customerinfo customerinfo)throws Exception;

	public Integer updateCustomerinfo(Customerinfo customerinfo)throws Exception;

	public Integer deleteCustomerinfoById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteCustomerinfo(Map<String,List<String>> params);

}
