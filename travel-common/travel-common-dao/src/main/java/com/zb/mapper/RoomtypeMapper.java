package com.zb.mapper;
import com.zb.pojo.Roomtype;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoomtypeMapper {

	public Roomtype getRoomtypeById(@Param(value = "id") Integer id)throws Exception;

	public List<Roomtype>	getRoomtypeListByMap(Map<String,Object> param)throws Exception;

	public Integer getRoomtypeCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertRoomtype(Roomtype roomtype)throws Exception;

	public Integer updateRoomtype(Roomtype roomtype)throws Exception;

	public Integer deleteRoomtypeById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteRoomtype(Map<String,List<String>> params);

}
