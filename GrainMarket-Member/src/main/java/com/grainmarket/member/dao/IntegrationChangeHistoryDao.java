package com.grainmarket.member.dao;

import com.grainmarket.member.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 * 
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-16 11:56:30
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistoryEntity> {
	
}
