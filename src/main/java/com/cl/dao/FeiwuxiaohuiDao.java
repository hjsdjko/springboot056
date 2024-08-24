package com.cl.dao;

import com.cl.entity.FeiwuxiaohuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FeiwuxiaohuiView;


/**
 * 废物销毁
 * 
 * @author 
 * @email 
 * @date 2024-03-29 15:52:06
 */
public interface FeiwuxiaohuiDao extends BaseMapper<FeiwuxiaohuiEntity> {
	
	List<FeiwuxiaohuiView> selectListView(@Param("ew") Wrapper<FeiwuxiaohuiEntity> wrapper);

	List<FeiwuxiaohuiView> selectListView(Pagination page,@Param("ew") Wrapper<FeiwuxiaohuiEntity> wrapper);
	
	FeiwuxiaohuiView selectView(@Param("ew") Wrapper<FeiwuxiaohuiEntity> wrapper);
	

}
