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

import com.cl.entity.FeiwucunchuEntity;
import com.cl.entity.view.FeiwucunchuView;

import com.cl.service.FeiwucunchuService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 废物存储
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-29 15:52:06
 */
@RestController
@RequestMapping("/feiwucunchu")
public class FeiwucunchuController {
    @Autowired
    private FeiwucunchuService feiwucunchuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FeiwucunchuEntity feiwucunchu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("chuzhiyuan")) {
			feiwucunchu.setChuzhizhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zhuanyunyuan")) {
			feiwucunchu.setZhuanyunzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FeiwucunchuEntity> ew = new EntityWrapper<FeiwucunchuEntity>();

		PageUtils page = feiwucunchuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, feiwucunchu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FeiwucunchuEntity feiwucunchu, 
		HttpServletRequest request){
        EntityWrapper<FeiwucunchuEntity> ew = new EntityWrapper<FeiwucunchuEntity>();

		PageUtils page = feiwucunchuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, feiwucunchu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FeiwucunchuEntity feiwucunchu){
       	EntityWrapper<FeiwucunchuEntity> ew = new EntityWrapper<FeiwucunchuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( feiwucunchu, "feiwucunchu")); 
        return R.ok().put("data", feiwucunchuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FeiwucunchuEntity feiwucunchu){
        EntityWrapper< FeiwucunchuEntity> ew = new EntityWrapper< FeiwucunchuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( feiwucunchu, "feiwucunchu")); 
		FeiwucunchuView feiwucunchuView =  feiwucunchuService.selectView(ew);
		return R.ok("查询废物存储成功").put("data", feiwucunchuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FeiwucunchuEntity feiwucunchu = feiwucunchuService.selectById(id);
		feiwucunchu = feiwucunchuService.selectView(new EntityWrapper<FeiwucunchuEntity>().eq("id", id));
        return R.ok().put("data", feiwucunchu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FeiwucunchuEntity feiwucunchu = feiwucunchuService.selectById(id);
		feiwucunchu = feiwucunchuService.selectView(new EntityWrapper<FeiwucunchuEntity>().eq("id", id));
        return R.ok().put("data", feiwucunchu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FeiwucunchuEntity feiwucunchu, HttpServletRequest request){
    	feiwucunchu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(feiwucunchu);
        feiwucunchuService.insert(feiwucunchu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FeiwucunchuEntity feiwucunchu, HttpServletRequest request){
    	feiwucunchu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(feiwucunchu);
        feiwucunchuService.insert(feiwucunchu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FeiwucunchuEntity feiwucunchu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(feiwucunchu);
        feiwucunchuService.updateById(feiwucunchu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        feiwucunchuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
