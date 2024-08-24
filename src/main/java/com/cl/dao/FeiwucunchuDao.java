package com.cl.dao;

import com.cl.entity.FeiwucunchuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FeiwucunchuView;


/**
 * 废物存储
 * 
 * @author 
 * @email 
 * @date 2024-03-29 15:52:06
 */
public interface FeiwucunchuDao extends BaseMapper<FeiwucunchuEntity> {
	
	List<FeiwucunchuView> selectListView(@Param("ew") Wrapper<FeiwucunchuEntity> wrapper);

	List<FeiwucunchuView> selectListView(Pagination page,@Param("ew") Wrapper<FeiwucunchuEntity> wrapper);
	
	FeiwucunchuView selectView(@Param("ew") Wrapper<FeiwucunchuEntity> wrapper);
	

}
