package com.grainmarket.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-16 10:57:00
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

