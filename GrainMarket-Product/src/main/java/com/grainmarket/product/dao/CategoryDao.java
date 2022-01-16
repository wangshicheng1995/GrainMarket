package com.grainmarket.product.dao;

import com.grainmarket.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2021-12-20 22:02:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
