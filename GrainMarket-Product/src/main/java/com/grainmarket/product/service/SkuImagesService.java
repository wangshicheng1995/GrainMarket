package com.grainmarket.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2021-12-20 22:02:34
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

