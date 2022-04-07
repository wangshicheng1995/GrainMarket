package com.grainmarket.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-18 22:25:46
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

