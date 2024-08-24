package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.FeiwucunchuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FeiwucunchuView;


/**
 * 废物存储
 *
 * @author 
 * @email 
 * @date 2024-03-29 15:52:06
 */
public interface FeiwucunchuService extends IService<FeiwucunchuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FeiwucunchuView> selectListView(Wrapper<FeiwucunchuEntity> wrapper);
   	
   	FeiwucunchuView selectView(@Param("ew") Wrapper<FeiwucunchuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FeiwucunchuEntity> wrapper);
   	

}

