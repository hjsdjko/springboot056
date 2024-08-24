package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.FeiwudengjiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FeiwudengjiView;


/**
 * 废物登记
 *
 * @author 
 * @email 
 * @date 2024-03-29 15:52:05
 */
public interface FeiwudengjiService extends IService<FeiwudengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FeiwudengjiView> selectListView(Wrapper<FeiwudengjiEntity> wrapper);
   	
   	FeiwudengjiView selectView(@Param("ew") Wrapper<FeiwudengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FeiwudengjiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<FeiwudengjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<FeiwudengjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<FeiwudengjiEntity> wrapper);



}

