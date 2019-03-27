package com.zb.mapper;
import com.zb.pojo.Shipcontact;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShipcontactMapper {

	public Shipcontact getShipcontactById(@Param(value = "id") Long id)throws Exception;

	public List<Shipcontact>	getShipcontactListByMap(Map<String,Object> param)throws Exception;

	public Integer getShipcontactCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertShipcontact(Shipcontact shipcontact)throws Exception;

	public Integer updateShipcontact(Shipcontact shipcontact)throws Exception;

	public Integer deleteShipcontactById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteShipcontact(Map<String,List<String>> params);

}
