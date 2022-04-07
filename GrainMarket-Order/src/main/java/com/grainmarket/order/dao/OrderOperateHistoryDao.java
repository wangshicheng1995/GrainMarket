package com.grainmarket.order.dao;

import com.grainmarket.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-18 22:25:46
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
