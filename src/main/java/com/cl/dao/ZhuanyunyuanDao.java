package com.cl.dao;

import com.cl.entity.ZhuanyunyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhuanyunyuanView;


/**
 * 转运员
 * 
 * @author 
 * @email 
 * @date 2024-03-29 15:52:05
 */
public interface ZhuanyunyuanDao extends BaseMapper<ZhuanyunyuanEntity> {
	
	List<ZhuanyunyuanView> selectListView(@Param("ew") Wrapper<ZhuanyunyuanEntity> wrapper);

	List<ZhuanyunyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanyunyuanEntity> wrapper);
	
	ZhuanyunyuanView selectView(@Param("ew") Wrapper<ZhuanyunyuanEntity> wrapper);
	

}
