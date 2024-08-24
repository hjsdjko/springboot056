package com.cl.dao;

import com.cl.entity.DengjiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DengjiyuanView;


/**
 * 登记员
 * 
 * @author 
 * @email 
 * @date 2024-03-29 15:52:05
 */
public interface DengjiyuanDao extends BaseMapper<DengjiyuanEntity> {
	
	List<DengjiyuanView> selectListView(@Param("ew") Wrapper<DengjiyuanEntity> wrapper);

	List<DengjiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DengjiyuanEntity> wrapper);
	
	DengjiyuanView selectView(@Param("ew") Wrapper<DengjiyuanEntity> wrapper);
	

}
