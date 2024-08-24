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
 * 废物登记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-29 15:52:05
 */
@TableName("feiwudengji")
public class FeiwudengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FeiwudengjiEntity() {
		
	}
	
	public FeiwudengjiEntity(T t) {
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
	 * 废物名称
	 */
					
	private String feiwumingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 废物类别
	 */
					
	private String feiwuleibie;
	
	/**
	 * 医疗机构名称
	 */
					
	private String yiliaojigoumingcheng;
	
	/**
	 * 产生科室
	 */
					
	private String chanshengkeshi;
	
	/**
	 * 存放地点
	 */
					
	private String cunfangdidian;
	
	/**
	 * 登记日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
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
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
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
	 * 设置：医疗机构名称
	 */
	public void setYiliaojigoumingcheng(String yiliaojigoumingcheng) {
		this.yiliaojigoumingcheng = yiliaojigoumingcheng;
	}
	/**
	 * 获取：医疗机构名称
	 */
	public String getYiliaojigoumingcheng() {
		return yiliaojigoumingcheng;
	}
	/**
	 * 设置：产生科室
	 */
	public void setChanshengkeshi(String chanshengkeshi) {
		this.chanshengkeshi = chanshengkeshi;
	}
	/**
	 * 获取：产生科室
	 */
	public String getChanshengkeshi() {
		return chanshengkeshi;
	}
	/**
	 * 设置：存放地点
	 */
	public void setCunfangdidian(String cunfangdidian) {
		this.cunfangdidian = cunfangdidian;
	}
	/**
	 * 获取：存放地点
	 */
	public String getCunfangdidian() {
		return cunfangdidian;
	}
	/**
	 * 设置：登记日期
	 */
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
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
