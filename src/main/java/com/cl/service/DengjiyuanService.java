package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DengjiyuanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DengjiyuanView;


/**
 * 登记员
 *
 * @author 
 * @email 
 * @date 2024-03-29 15:52:05
 */
public interface DengjiyuanService extends IService<DengjiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DengjiyuanView> selectListView(Wrapper<DengjiyuanEntity> wrapper);
   	
   	DengjiyuanView selectView(@Param("ew") Wrapper<DengjiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DengjiyuanEntity> wrapper);
   	

}

