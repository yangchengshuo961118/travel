package com.zb.mapper;
import com.zb.pojo.Newstype;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NewstypeMapper {

	public Newstype getNewstypeById(@Param(value = "id") Long id)throws Exception;

	public List<Newstype>	getNewstypeListByMap(Map<String,Object> param)throws Exception;

	public Integer getNewstypeCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertNewstype(Newstype newstype)throws Exception;

	public Integer updateNewstype(Newstype newstype)throws Exception;

	public Integer deleteNewstypeById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteNewstype(Map<String,List<String>> params);

}
