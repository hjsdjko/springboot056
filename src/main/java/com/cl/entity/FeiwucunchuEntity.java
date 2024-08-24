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
 * 废物存储
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-29 15:52:06
 */
@TableName("feiwucunchu")
public class FeiwucunchuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FeiwucunchuEntity() {
		
	}
	
	public FeiwucunchuEntity(T t) {
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
	 * 处置账号
	 */
					
	private String chuzhizhanghao;
	
	/**
	 * 处置员
	 */
					
	private String chuzhiyuan;
	
	/**
	 * 废物名称
	 */
					
	private String feiwumingcheng;
	
	/**
	 * 废物类别
	 */
					
	private String feiwuleibie;
	
	/**
	 * 存储地点
	 */
					
	private String cunchudidian;
	
	/**
	 * 存储时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date cunchushijian;
	
	/**
	 * 转运账号
	 */
					
	private String zhuanyunzhanghao;
	
	/**
	 * 转运员
	 */
					
	private String zhuanyunyuan;
	
	
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
	 * 设置：处置账号
	 */
	public void setChuzhizhanghao(String chuzhizhanghao) {
		this.chuzhizhanghao = chuzhizhanghao;
	}
	/**
	 * 获取：处置账号
	 */
	public String getChuzhizhanghao() {
		return chuzhizhanghao;
	}
	/**
	 * 设置：处置员
	 */
	public void setChuzhiyuan(String chuzhiyuan) {
		this.chuzhiyuan = chuzhiyuan;
	}
	/**
	 * 获取：处置员
	 */
	public String getChuzhiyuan() {
		return chuzhiyuan;
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
	 * 设置：存储地点
	 */
	public void setCunchudidian(String cunchudidian) {
		this.cunchudidian = cunchudidian;
	}
	/**
	 * 获取：存储地点
	 */
	public String getCunchudidian() {
		return cunchudidian;
	}
	/**
	 * 设置：存储时间
	 */
	public void setCunchushijian(Date cunchushijian) {
		this.cunchushijian = cunchushijian;
	}
	/**
	 * 获取：存储时间
	 */
	public Date getCunchushijian() {
		return cunchushijian;
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

}
