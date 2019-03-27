package com.zb.mapper;
import com.zb.pojo.Roles;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RolesMapper {

	public Roles getRolesById(@Param(value = "id") Long id)throws Exception;

	public List<Roles>	getRolesListByMap(Map<String,Object> param)throws Exception;

	public Integer getRolesCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertRoles(Roles roles)throws Exception;

	public Integer updateRoles(Roles roles)throws Exception;

	public Integer deleteRolesById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteRoles(Map<String,List<String>> params);

}
