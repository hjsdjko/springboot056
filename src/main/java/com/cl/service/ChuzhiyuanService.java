package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ChuzhiyuanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChuzhiyuanView;


/**
 * 处置员
 *
 * @author 
 * @email 
 * @date 2024-03-29 15:52:05
 */
public interface ChuzhiyuanService extends IService<ChuzhiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuzhiyuanView> selectListView(Wrapper<ChuzhiyuanEntity> wrapper);
   	
   	ChuzhiyuanView selectView(@Param("ew") Wrapper<ChuzhiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuzhiyuanEntity> wrapper);
   	

}

