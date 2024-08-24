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


import com.cl.dao.FeiwujiaojieDao;
import com.cl.entity.FeiwujiaojieEntity;
import com.cl.service.FeiwujiaojieService;
import com.cl.entity.view.FeiwujiaojieView;

@Service("feiwujiaojieService")
public class FeiwujiaojieServiceImpl extends ServiceImpl<FeiwujiaojieDao, FeiwujiaojieEntity> implements FeiwujiaojieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FeiwujiaojieEntity> page = this.selectPage(
                new Query<FeiwujiaojieEntity>(params).getPage(),
                new EntityWrapper<FeiwujiaojieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FeiwujiaojieEntity> wrapper) {
		  Page<FeiwujiaojieView> page =new Query<FeiwujiaojieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<FeiwujiaojieView> selectListView(Wrapper<FeiwujiaojieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FeiwujiaojieView selectView(Wrapper<FeiwujiaojieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
