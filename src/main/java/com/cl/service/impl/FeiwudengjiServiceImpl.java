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


import com.cl.dao.FeiwudengjiDao;
import com.cl.entity.FeiwudengjiEntity;
import com.cl.service.FeiwudengjiService;
import com.cl.entity.view.FeiwudengjiView;

@Service("feiwudengjiService")
public class FeiwudengjiServiceImpl extends ServiceImpl<FeiwudengjiDao, FeiwudengjiEntity> implements FeiwudengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FeiwudengjiEntity> page = this.selectPage(
                new Query<FeiwudengjiEntity>(params).getPage(),
                new EntityWrapper<FeiwudengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FeiwudengjiEntity> wrapper) {
		  Page<FeiwudengjiView> page =new Query<FeiwudengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<FeiwudengjiView> selectListView(Wrapper<FeiwudengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FeiwudengjiView selectView(Wrapper<FeiwudengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<FeiwudengjiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<FeiwudengjiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<FeiwudengjiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
