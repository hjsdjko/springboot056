package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.FeiwuxiaohuiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FeiwuxiaohuiView;


/**
 * 废物销毁
 *
 * @author 
 * @email 
 * @date 2024-03-29 15:52:06
 */
public interface FeiwuxiaohuiService extends IService<FeiwuxiaohuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FeiwuxiaohuiView> selectListView(Wrapper<FeiwuxiaohuiEntity> wrapper);
   	
   	FeiwuxiaohuiView selectView(@Param("ew") Wrapper<FeiwuxiaohuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FeiwuxiaohuiEntity> wrapper);
   	

}

