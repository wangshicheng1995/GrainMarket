package com.grainmarket.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2021-12-20 22:02:35
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

