package com.zb.mapper;
import com.zb.pojo.Travelnotes;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TravelnotesMapper {

	public Travelnotes getTravelnotesById(@Param(value = "id") Long id)throws Exception;

	public List<Travelnotes>	getTravelnotesListByMap(Map<String,Object> param)throws Exception;

	public Integer getTravelnotesCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertTravelnotes(Travelnotes travelnotes)throws Exception;

	public Integer updateTravelnotes(Travelnotes travelnotes)throws Exception;

	public Integer deleteTravelnotesById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteTravelnotes(Map<String,List<String>> params);

}
