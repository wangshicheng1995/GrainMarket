package com.grainmarket.member.dao;

import com.grainmarket.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-16 11:56:30
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
	
}
