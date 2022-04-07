package com.grainmarket.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-22 14:52:41
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

