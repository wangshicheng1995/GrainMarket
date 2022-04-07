package com.grainmarket.ware.dao;

import com.grainmarket.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-22 14:52:40
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
