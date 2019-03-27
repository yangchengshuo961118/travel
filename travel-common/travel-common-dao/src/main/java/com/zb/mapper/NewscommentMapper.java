package com.zb.mapper;
import com.zb.pojo.Newscomment;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NewscommentMapper {

	public Newscomment getNewscommentById(@Param(value = "id") Long id)throws Exception;

	public List<Newscomment>	getNewscommentListByMap(Map<String,Object> param)throws Exception;

	public Integer getNewscommentCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertNewscomment(Newscomment newscomment)throws Exception;

	public Integer updateNewscomment(Newscomment newscomment)throws Exception;

	public Integer deleteNewscommentById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteNewscomment(Map<String,List<String>> params);

}
