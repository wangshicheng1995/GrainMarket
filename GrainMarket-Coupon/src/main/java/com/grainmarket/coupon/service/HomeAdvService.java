package com.grainmarket.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-16 10:57:00
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

