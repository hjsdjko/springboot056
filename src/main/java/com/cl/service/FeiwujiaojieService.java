package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.FeiwujiaojieEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FeiwujiaojieView;


/**
 * 废物交接
 *
 * @author 
 * @email 
 * @date 2024-03-29 15:52:05
 */
public interface FeiwujiaojieService extends IService<FeiwujiaojieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FeiwujiaojieView> selectListView(Wrapper<FeiwujiaojieEntity> wrapper);
   	
   	FeiwujiaojieView selectView(@Param("ew") Wrapper<FeiwujiaojieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FeiwujiaojieEntity> wrapper);
   	

}

