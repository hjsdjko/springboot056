package com.cl.dao;

import com.cl.entity.FeiwudengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FeiwudengjiView;


/**
 * 废物登记
 * 
 * @author 
 * @email 
 * @date 2024-03-29 15:52:05
 */
public interface FeiwudengjiDao extends BaseMapper<FeiwudengjiEntity> {
	
	List<FeiwudengjiView> selectListView(@Param("ew") Wrapper<FeiwudengjiEntity> wrapper);

	List<FeiwudengjiView> selectListView(Pagination page,@Param("ew") Wrapper<FeiwudengjiEntity> wrapper);
	
	FeiwudengjiView selectView(@Param("ew") Wrapper<FeiwudengjiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<FeiwudengjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<FeiwudengjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<FeiwudengjiEntity> wrapper);



}
