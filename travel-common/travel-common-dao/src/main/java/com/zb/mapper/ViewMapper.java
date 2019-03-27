package com.zb.mapper;
import com.zb.pojo.View;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ViewMapper {

	public View getViewById(@Param(value = "id") Long id)throws Exception;

	public List<View>	getViewListByMap(Map<String,Object> param)throws Exception;

	public Integer getViewCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertView(View view)throws Exception;

	public Integer updateView(View view)throws Exception;

	public Integer deleteViewById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteView(Map<String,List<String>> params);

}
