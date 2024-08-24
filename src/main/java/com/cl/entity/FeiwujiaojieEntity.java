package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 废物交接
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-29 15:52:05
 */
@TableName("feiwujiaojie")
public class FeiwujiaojieEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FeiwujiaojieEntity() {
		
	}
	
	public FeiwujiaojieEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 转运账号
	 */
					
	private String zhuanyunzhanghao;
	
	/**
	 * 转运员
	 */
					
	private String zhuanyunyuan;
	
	/**
	 * 废物名称
	 */
					
	private String feiwumingcheng;
	
	/**
	 * 废物类别
	 */
					
	private String feiwuleibie;
	
	/**
	 * 交接地点
	 */
					
	private String jiaojiedidian;
	
	/**
	 * 交接日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jiaojieriqi;
	
	/**
	 * 运输工具
	 */
					
	private String yunshugongju;
	
	/**
	 * 登记账号
	 */
					
	private String dengjizhanghao;
	
	/**
	 * 登记员
	 */
					
	private String dengjiyuan;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：转运账号
	 */
	public void setZhuanyunzhanghao(String zhuanyunzhanghao) {
		this.zhuanyunzhanghao = zhuanyunzhanghao;
	}
	/**
	 * 获取：转运账号
	 */
	public String getZhuanyunzhanghao() {
		return zhuanyunzhanghao;
	}
	/**
	 * 设置：转运员
	 */
	public void setZhuanyunyuan(String zhuanyunyuan) {
		this.zhuanyunyuan = zhuanyunyuan;
	}
	/**
	 * 获取：转运员
	 */
	public String getZhuanyunyuan() {
		return zhuanyunyuan;
	}
	/**
	 * 设置：废物名称
	 */
	public void setFeiwumingcheng(String feiwumingcheng) {
		this.feiwumingcheng = feiwumingcheng;
	}
	/**
	 * 获取：废物名称
	 */
	public String getFeiwumingcheng() {
		return feiwumingcheng;
	}
	/**
	 * 设置：废物类别
	 */
	public void setFeiwuleibie(String feiwuleibie) {
		this.feiwuleibie = feiwuleibie;
	}
	/**
	 * 获取：废物类别
	 */
	public String getFeiwuleibie() {
		return feiwuleibie;
	}
	/**
	 * 设置：交接地点
	 */
	public void setJiaojiedidian(String jiaojiedidian) {
		this.jiaojiedidian = jiaojiedidian;
	}
	/**
	 * 获取：交接地点
	 */
	public String getJiaojiedidian() {
		return jiaojiedidian;
	}
	/**
	 * 设置：交接日期
	 */
	public void setJiaojieriqi(Date jiaojieriqi) {
		this.jiaojieriqi = jiaojieriqi;
	}
	/**
	 * 获取：交接日期
	 */
	public Date getJiaojieriqi() {
		return jiaojieriqi;
	}
	/**
	 * 设置：运输工具
	 */
	public void setYunshugongju(String yunshugongju) {
		this.yunshugongju = yunshugongju;
	}
	/**
	 * 获取：运输工具
	 */
	public String getYunshugongju() {
		return yunshugongju;
	}
	/**
	 * 设置：登记账号
	 */
	public void setDengjizhanghao(String dengjizhanghao) {
		this.dengjizhanghao = dengjizhanghao;
	}
	/**
	 * 获取：登记账号
	 */
	public String getDengjizhanghao() {
		return dengjizhanghao;
	}
	/**
	 * 设置：登记员
	 */
	public void setDengjiyuan(String dengjiyuan) {
		this.dengjiyuan = dengjiyuan;
	}
	/**
	 * 获取：登记员
	 */
	public String getDengjiyuan() {
		return dengjiyuan;
	}

}
