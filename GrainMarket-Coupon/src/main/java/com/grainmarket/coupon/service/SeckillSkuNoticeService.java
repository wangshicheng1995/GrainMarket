package com.grainmarket.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-16 10:57:00
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

