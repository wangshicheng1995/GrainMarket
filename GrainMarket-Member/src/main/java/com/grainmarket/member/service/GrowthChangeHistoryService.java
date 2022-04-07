package com.grainmarket.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-16 11:56:30
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

