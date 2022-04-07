package com.grainmarket.coupon.dao;

import com.grainmarket.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-16 10:57:00
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
