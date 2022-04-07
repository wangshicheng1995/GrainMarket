package com.grainmarket.member.dao;

import com.grainmarket.member.entity.MemberCollectSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员收藏的专题活动
 * 
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-16 11:56:30
 */
@Mapper
public interface MemberCollectSubjectDao extends BaseMapper<MemberCollectSubjectEntity> {
	
}
