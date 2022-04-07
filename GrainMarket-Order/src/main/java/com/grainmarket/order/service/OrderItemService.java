package com.grainmarket.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-18 22:25:46
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

