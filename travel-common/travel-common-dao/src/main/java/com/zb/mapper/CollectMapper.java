package com.zb.mapper;
import com.zb.pojo.Collect;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CollectMapper {

	public Collect getCollectById(@Param(value = "id") Long id)throws Exception;

	public List<Collect>	getCollectListByMap(Map<String,Object> param)throws Exception;

	public Integer getCollectCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCollect(Collect collect)throws Exception;

	public Integer updateCollect(Collect collect)throws Exception;

	public Integer deleteCollectById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteCollect(Map<String,List<String>> params);

}
