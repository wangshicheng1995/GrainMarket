package com.grainmarket.order.dao;

import com.grainmarket.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-18 22:25:46
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
