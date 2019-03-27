package com.zb.mapper;
import com.zb.pojo.Room;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoomMapper {

	public Room getRoomById(@Param(value = "id") Long id)throws Exception;

	public List<Room>	getRoomListByMap(Map<String,Object> param)throws Exception;

	public Integer getRoomCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertRoom(Room room)throws Exception;

	public Integer updateRoom(Room room)throws Exception;

	public Integer deleteRoomById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteRoom(Map<String,List<String>> params);

}
