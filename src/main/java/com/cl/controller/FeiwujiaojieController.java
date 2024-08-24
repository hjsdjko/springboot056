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

import com.cl.entity.FeiwujiaojieEntity;
import com.cl.entity.view.FeiwujiaojieView;

import com.cl.service.FeiwujiaojieService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 废物交接
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-29 15:52:05
 */
@RestController
@RequestMapping("/feiwujiaojie")
public class FeiwujiaojieController {
    @Autowired
    private FeiwujiaojieService feiwujiaojieService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FeiwujiaojieEntity feiwujiaojie,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhuanyunyuan")) {
			feiwujiaojie.setZhuanyunzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("dengjiyuan")) {
			feiwujiaojie.setDengjizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FeiwujiaojieEntity> ew = new EntityWrapper<FeiwujiaojieEntity>();

		PageUtils page = feiwujiaojieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, feiwujiaojie), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FeiwujiaojieEntity feiwujiaojie, 
		HttpServletRequest request){
        EntityWrapper<FeiwujiaojieEntity> ew = new EntityWrapper<FeiwujiaojieEntity>();

		PageUtils page = feiwujiaojieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, feiwujiaojie), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FeiwujiaojieEntity feiwujiaojie){
       	EntityWrapper<FeiwujiaojieEntity> ew = new EntityWrapper<FeiwujiaojieEntity>();
      	ew.allEq(MPUtil.allEQMapPre( feiwujiaojie, "feiwujiaojie")); 
        return R.ok().put("data", feiwujiaojieService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FeiwujiaojieEntity feiwujiaojie){
        EntityWrapper< FeiwujiaojieEntity> ew = new EntityWrapper< FeiwujiaojieEntity>();
 		ew.allEq(MPUtil.allEQMapPre( feiwujiaojie, "feiwujiaojie")); 
		FeiwujiaojieView feiwujiaojieView =  feiwujiaojieService.selectView(ew);
		return R.ok("查询废物交接成功").put("data", feiwujiaojieView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FeiwujiaojieEntity feiwujiaojie = feiwujiaojieService.selectById(id);
		feiwujiaojie = feiwujiaojieService.selectView(new EntityWrapper<FeiwujiaojieEntity>().eq("id", id));
        return R.ok().put("data", feiwujiaojie);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FeiwujiaojieEntity feiwujiaojie = feiwujiaojieService.selectById(id);
		feiwujiaojie = feiwujiaojieService.selectView(new EntityWrapper<FeiwujiaojieEntity>().eq("id", id));
        return R.ok().put("data", feiwujiaojie);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FeiwujiaojieEntity feiwujiaojie, HttpServletRequest request){
    	feiwujiaojie.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(feiwujiaojie);
        feiwujiaojieService.insert(feiwujiaojie);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FeiwujiaojieEntity feiwujiaojie, HttpServletRequest request){
    	feiwujiaojie.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(feiwujiaojie);
        feiwujiaojieService.insert(feiwujiaojie);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FeiwujiaojieEntity feiwujiaojie, HttpServletRequest request){
        //ValidatorUtils.validateEntity(feiwujiaojie);
        feiwujiaojieService.updateById(feiwujiaojie);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        feiwujiaojieService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
