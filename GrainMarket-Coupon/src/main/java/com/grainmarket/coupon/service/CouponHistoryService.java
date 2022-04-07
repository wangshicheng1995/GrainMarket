package com.grainmarket.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-16 10:57:00
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

