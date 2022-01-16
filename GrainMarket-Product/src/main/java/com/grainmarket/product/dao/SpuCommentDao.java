package com.grainmarket.product.dao;

import com.grainmarket.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2021-12-20 22:02:35
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
