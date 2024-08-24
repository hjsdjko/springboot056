package com.cl.entity.view;

import com.cl.entity.FeiwuxiaohuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 废物销毁
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-29 15:52:06
 */
@TableName("feiwuxiaohui")
public class FeiwuxiaohuiView  extends FeiwuxiaohuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FeiwuxiaohuiView(){
	}
 
 	public FeiwuxiaohuiView(FeiwuxiaohuiEntity feiwuxiaohuiEntity){
 	try {
			BeanUtils.copyProperties(this, feiwuxiaohuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
