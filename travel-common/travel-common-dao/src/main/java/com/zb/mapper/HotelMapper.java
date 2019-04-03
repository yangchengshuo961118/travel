package com.zb.mapper;
import com.zb.pojo.Hotel;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HotelMapper {

	public Hotel getHotelById(@Param(value = "id") Integer id)throws Exception;

	public List<Hotel>	getHotelListByMap(Map<String,Object> param)throws Exception;

	public Integer getHotelCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertHotel(Hotel hotel)throws Exception;

	public Integer updateHotel(Hotel hotel)throws Exception;

	public Integer deleteHotelById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteHotel(Map<String,List<String>> params);

}
