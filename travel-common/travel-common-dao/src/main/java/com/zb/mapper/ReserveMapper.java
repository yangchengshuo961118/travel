package com.zb.mapper;
import com.zb.pojo.Reserve;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReserveMapper {

	public Reserve getReserveById(@Param(value = "id") Long id)throws Exception;

	public List<Reserve>	getReserveListByMap(Map<String,Object> param)throws Exception;

	public Integer getReserveCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertReserve(Reserve reserve)throws Exception;

	public Integer updateReserve(Reserve reserve)throws Exception;

	public Integer deleteReserveById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteReserve(Map<String,List<String>> params);

}
