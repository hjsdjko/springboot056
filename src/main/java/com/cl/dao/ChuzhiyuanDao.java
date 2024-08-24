package com.cl.dao;

import com.cl.entity.ChuzhiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChuzhiyuanView;


/**
 * 处置员
 * 
 * @author 
 * @email 
 * @date 2024-03-29 15:52:05
 */
public interface ChuzhiyuanDao extends BaseMapper<ChuzhiyuanEntity> {
	
	List<ChuzhiyuanView> selectListView(@Param("ew") Wrapper<ChuzhiyuanEntity> wrapper);

	List<ChuzhiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ChuzhiyuanEntity> wrapper);
	
	ChuzhiyuanView selectView(@Param("ew") Wrapper<ChuzhiyuanEntity> wrapper);
	

}
