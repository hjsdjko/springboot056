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


import com.cl.dao.FeiwucunchuDao;
import com.cl.entity.FeiwucunchuEntity;
import com.cl.service.FeiwucunchuService;
import com.cl.entity.view.FeiwucunchuView;

@Service("feiwucunchuService")
public class FeiwucunchuServiceImpl extends ServiceImpl<FeiwucunchuDao, FeiwucunchuEntity> implements FeiwucunchuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FeiwucunchuEntity> page = this.selectPage(
                new Query<FeiwucunchuEntity>(params).getPage(),
                new EntityWrapper<FeiwucunchuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FeiwucunchuEntity> wrapper) {
		  Page<FeiwucunchuView> page =new Query<FeiwucunchuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<FeiwucunchuView> selectListView(Wrapper<FeiwucunchuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FeiwucunchuView selectView(Wrapper<FeiwucunchuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
