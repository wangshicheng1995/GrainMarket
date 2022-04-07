package com.grainmarket.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-16 10:57:00
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

