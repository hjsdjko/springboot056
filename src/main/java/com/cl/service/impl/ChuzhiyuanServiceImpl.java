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


import com.cl.dao.ChuzhiyuanDao;
import com.cl.entity.ChuzhiyuanEntity;
import com.cl.service.ChuzhiyuanService;
import com.cl.entity.view.ChuzhiyuanView;

@Service("chuzhiyuanService")
public class ChuzhiyuanServiceImpl extends ServiceImpl<ChuzhiyuanDao, ChuzhiyuanEntity> implements ChuzhiyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuzhiyuanEntity> page = this.selectPage(
                new Query<ChuzhiyuanEntity>(params).getPage(),
                new EntityWrapper<ChuzhiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuzhiyuanEntity> wrapper) {
		  Page<ChuzhiyuanView> page =new Query<ChuzhiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ChuzhiyuanView> selectListView(Wrapper<ChuzhiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuzhiyuanView selectView(Wrapper<ChuzhiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
