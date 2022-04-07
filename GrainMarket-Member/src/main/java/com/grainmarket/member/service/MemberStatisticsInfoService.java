package com.grainmarket.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-16 11:56:30
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

