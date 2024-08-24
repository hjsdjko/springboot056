package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZhuanyunyuanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhuanyunyuanView;


/**
 * 转运员
 *
 * @author 
 * @email 
 * @date 2024-03-29 15:52:05
 */
public interface ZhuanyunyuanService extends IService<ZhuanyunyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanyunyuanView> selectListView(Wrapper<ZhuanyunyuanEntity> wrapper);
   	
   	ZhuanyunyuanView selectView(@Param("ew") Wrapper<ZhuanyunyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanyunyuanEntity> wrapper);
   	

}

