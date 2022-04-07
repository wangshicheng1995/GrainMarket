package com.grainmarket.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-16 11:56:30
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

