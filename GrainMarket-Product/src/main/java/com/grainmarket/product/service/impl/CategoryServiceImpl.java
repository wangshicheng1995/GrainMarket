package com.grainmarket.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.common.utils.Query;

import com.grainmarket.product.dao.CategoryDao;
import com.grainmarket.product.entity.CategoryEntity;
import com.grainmarket.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 1.查出所有分类
     * 2.组装成父子的树形结构
     *
     * @return java.util.List<com.grainmarket.product.entity.CategoryEntity>
     * @author echo
     * @date 2022/4/6
     */
    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> entities = baseMapper.selectList(null);
        // 找到所有一级分类
        List<CategoryEntity> level1Menus = new ArrayList<>();
        entities.forEach(entity -> {
            // 一级分类
            if (entity.getParentCid() == 0) {
                entity.setChildren(getChildren(entity, entities));
                level1Menus.add(entity);
            }
        });
        return level1Menus.stream()
                .sorted(Comparator.comparingInt(CategoryEntity::getSort))
                .collect(Collectors.toList());
    }

    /**
     * 递归查找菜单的子菜单
     *
     * @param root
     * @param all
     * @return java.util.List<com.grainmarket.product.entity.CategoryEntity>
     * @author echo
     * @date 2022/4/6
     */
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream()
                .filter(categoryEntity -> Objects.equals(categoryEntity.getParentCid(), root.getCatId()))
                .map(categoryEntity -> {
                    // 递归查找
                    categoryEntity.setChildren(getChildren(categoryEntity, all));
                    return categoryEntity;
                }).sorted(Comparator.comparingInt(CategoryEntity::getSort))
                .collect(Collectors.toList());
        return children;
    }

}