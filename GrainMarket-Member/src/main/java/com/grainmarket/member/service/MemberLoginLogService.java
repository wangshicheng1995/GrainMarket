package com.grainmarket.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-16 11:56:30
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

