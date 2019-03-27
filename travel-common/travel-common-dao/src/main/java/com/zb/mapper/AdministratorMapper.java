package com.zb.mapper;
import com.zb.pojo.Administrator;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdministratorMapper {

	public Administrator getAdministratorById(@Param(value = "id") Long id)throws Exception;

	public List<Administrator>	getAdministratorListByMap(Map<String,Object> param)throws Exception;

	public Integer getAdministratorCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertAdministrator(Administrator administrator)throws Exception;

	public Integer updateAdministrator(Administrator administrator)throws Exception;

	public Integer deleteAdministratorById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteAdministrator(Map<String,List<String>> params);

}
