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


import com.cl.dao.ZhuanyunyuanDao;
import com.cl.entity.ZhuanyunyuanEntity;
import com.cl.service.ZhuanyunyuanService;
import com.cl.entity.view.ZhuanyunyuanView;

@Service("zhuanyunyuanService")
public class ZhuanyunyuanServiceImpl extends ServiceImpl<ZhuanyunyuanDao, ZhuanyunyuanEntity> implements ZhuanyunyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanyunyuanEntity> page = this.selectPage(
                new Query<ZhuanyunyuanEntity>(params).getPage(),
                new EntityWrapper<ZhuanyunyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanyunyuanEntity> wrapper) {
		  Page<ZhuanyunyuanView> page =new Query<ZhuanyunyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ZhuanyunyuanView> selectListView(Wrapper<ZhuanyunyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanyunyuanView selectView(Wrapper<ZhuanyunyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
