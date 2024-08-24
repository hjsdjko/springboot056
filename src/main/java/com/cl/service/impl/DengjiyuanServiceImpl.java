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


import com.cl.dao.DengjiyuanDao;
import com.cl.entity.DengjiyuanEntity;
import com.cl.service.DengjiyuanService;
import com.cl.entity.view.DengjiyuanView;

@Service("dengjiyuanService")
public class DengjiyuanServiceImpl extends ServiceImpl<DengjiyuanDao, DengjiyuanEntity> implements DengjiyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DengjiyuanEntity> page = this.selectPage(
                new Query<DengjiyuanEntity>(params).getPage(),
                new EntityWrapper<DengjiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DengjiyuanEntity> wrapper) {
		  Page<DengjiyuanView> page =new Query<DengjiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DengjiyuanView> selectListView(Wrapper<DengjiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DengjiyuanView selectView(Wrapper<DengjiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
