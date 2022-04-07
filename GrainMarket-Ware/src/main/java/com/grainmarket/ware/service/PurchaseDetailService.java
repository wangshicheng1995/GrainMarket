package com.grainmarket.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-22 14:52:40
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

