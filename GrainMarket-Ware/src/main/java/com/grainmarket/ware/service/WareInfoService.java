package com.grainmarket.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-22 14:52:40
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

