package com.cl.dao;

import com.cl.entity.FeiwujiaojieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FeiwujiaojieView;


/**
 * 废物交接
 * 
 * @author 
 * @email 
 * @date 2024-03-29 15:52:05
 */
public interface FeiwujiaojieDao extends BaseMapper<FeiwujiaojieEntity> {
	
	List<FeiwujiaojieView> selectListView(@Param("ew") Wrapper<FeiwujiaojieEntity> wrapper);

	List<FeiwujiaojieView> selectListView(Pagination page,@Param("ew") Wrapper<FeiwujiaojieEntity> wrapper);
	
	FeiwujiaojieView selectView(@Param("ew") Wrapper<FeiwujiaojieEntity> wrapper);
	

}
