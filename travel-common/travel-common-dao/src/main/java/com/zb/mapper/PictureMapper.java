package com.zb.mapper;
import com.zb.pojo.Picture;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PictureMapper {

	public Picture getPictureById(@Param(value = "id") Long id)throws Exception;

	public List<Picture>	getPictureListByMap(Map<String,Object> param)throws Exception;

	public Integer getPictureCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertPicture(Picture picture)throws Exception;

	public Integer updatePicture(Picture picture)throws Exception;

	public Integer deletePictureById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeletePicture(Map<String,List<String>> params);

}
