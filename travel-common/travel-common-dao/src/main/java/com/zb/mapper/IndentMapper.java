package com.zb.mapper;
import com.zb.pojo.Indent;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IndentMapper {

	public Indent getIndentById(@Param(value = "id") Long id)throws Exception;

	public List<Indent>	getIndentListByMap(Map<String,Object> param)throws Exception;

	public Integer getIndentCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertIndent(Indent indent)throws Exception;

	public Integer updateIndent(Indent indent)throws Exception;

	public Integer deleteIndentById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteIndent(Map<String,List<String>> params);

}
