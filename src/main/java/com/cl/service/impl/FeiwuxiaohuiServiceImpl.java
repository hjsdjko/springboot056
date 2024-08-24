package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.FeiwuxiaohuiDao;
import com.cl.entity.FeiwuxiaohuiEntity;
import com.cl.service.FeiwuxiaohuiService;
import com.cl.entity.view.FeiwuxiaohuiView;

@Service("feiwuxiaohuiService")
public class FeiwuxiaohuiServiceImpl extends ServiceImpl<FeiwuxiaohuiDao, FeiwuxiaohuiEntity> implements FeiwuxiaohuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FeiwuxiaohuiEntity> page = this.selectPage(
                new Query<FeiwuxiaohuiEntity>(params).getPage(),
                new EntityWrapper<FeiwuxiaohuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FeiwuxiaohuiEntity> wrapper) {
		  Page<FeiwuxiaohuiView> page =new Query<FeiwuxiaohuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<FeiwuxiaohuiView> selectListView(Wrapper<FeiwuxiaohuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FeiwuxiaohuiView selectView(Wrapper<FeiwuxiaohuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
