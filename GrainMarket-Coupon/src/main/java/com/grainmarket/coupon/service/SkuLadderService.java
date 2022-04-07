package com.grainmarket.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-16 10:57:00
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

