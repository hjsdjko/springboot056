package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.FeiwuxiaohuiEntity;
import com.cl.entity.view.FeiwuxiaohuiView;

import com.cl.service.FeiwuxiaohuiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 废物销毁
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-29 15:52:06
 */
@RestController
@RequestMapping("/feiwuxiaohui")
public class FeiwuxiaohuiController {
    @Autowired
    private FeiwuxiaohuiService feiwuxiaohuiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FeiwuxiaohuiEntity feiwuxiaohui,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("chuzhiyuan")) {
			feiwuxiaohui.setChuzhizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FeiwuxiaohuiEntity> ew = new EntityWrapper<FeiwuxiaohuiEntity>();

		PageUtils page = feiwuxiaohuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, feiwuxiaohui), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FeiwuxiaohuiEntity feiwuxiaohui, 
		HttpServletRequest request){
        EntityWrapper<FeiwuxiaohuiEntity> ew = new EntityWrapper<FeiwuxiaohuiEntity>();

		PageUtils page = feiwuxiaohuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, feiwuxiaohui), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FeiwuxiaohuiEntity feiwuxiaohui){
       	EntityWrapper<FeiwuxiaohuiEntity> ew = new EntityWrapper<FeiwuxiaohuiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( feiwuxiaohui, "feiwuxiaohui")); 
        return R.ok().put("data", feiwuxiaohuiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FeiwuxiaohuiEntity feiwuxiaohui){
        EntityWrapper< FeiwuxiaohuiEntity> ew = new EntityWrapper< FeiwuxiaohuiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( feiwuxiaohui, "feiwuxiaohui")); 
		FeiwuxiaohuiView feiwuxiaohuiView =  feiwuxiaohuiService.selectView(ew);
		return R.ok("查询废物销毁成功").put("data", feiwuxiaohuiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FeiwuxiaohuiEntity feiwuxiaohui = feiwuxiaohuiService.selectById(id);
		feiwuxiaohui = feiwuxiaohuiService.selectView(new EntityWrapper<FeiwuxiaohuiEntity>().eq("id", id));
        return R.ok().put("data", feiwuxiaohui);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FeiwuxiaohuiEntity feiwuxiaohui = feiwuxiaohuiService.selectById(id);
		feiwuxiaohui = feiwuxiaohuiService.selectView(new EntityWrapper<FeiwuxiaohuiEntity>().eq("id", id));
        return R.ok().put("data", feiwuxiaohui);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FeiwuxiaohuiEntity feiwuxiaohui, HttpServletRequest request){
    	feiwuxiaohui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(feiwuxiaohui);
        feiwuxiaohuiService.insert(feiwuxiaohui);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FeiwuxiaohuiEntity feiwuxiaohui, HttpServletRequest request){
    	feiwuxiaohui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(feiwuxiaohui);
        feiwuxiaohuiService.insert(feiwuxiaohui);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FeiwuxiaohuiEntity feiwuxiaohui, HttpServletRequest request){
        //ValidatorUtils.validateEntity(feiwuxiaohui);
        feiwuxiaohuiService.updateById(feiwuxiaohui);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        feiwuxiaohuiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
