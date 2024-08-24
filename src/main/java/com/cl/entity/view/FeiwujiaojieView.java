package com.cl.entity.view;

import com.cl.entity.FeiwujiaojieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 废物交接
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-29 15:52:05
 */
@TableName("feiwujiaojie")
public class FeiwujiaojieView  extends FeiwujiaojieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FeiwujiaojieView(){
	}
 
 	public FeiwujiaojieView(FeiwujiaojieEntity feiwujiaojieEntity){
 	try {
			BeanUtils.copyProperties(this, feiwujiaojieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
