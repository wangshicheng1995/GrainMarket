package com.grainmarket.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.grainmarket.product.entity.BrandEntity;
import com.grainmarket.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GrainMarketProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
		QueryWrapper<BrandEntity> query = new QueryWrapper<>();
		query.eq("brand_id",3);
		List<BrandEntity> list = brandService.list(query);
		list.forEach(item -> {
			System.out.println(item);
		});
	}

}
