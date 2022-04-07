package com.grainmarket.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-22 14:52:40
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

