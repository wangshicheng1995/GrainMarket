package com.grainmarket.coupon.dao;

import com.grainmarket.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-16 10:57:00
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
