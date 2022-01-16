package com.grainmarket.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @MapperScan 告诉 SpringBoot 我们配置的 Mapper 文件在哪里
 *
 */
@MapperScan("com.grainmarket.product.dao")
@SpringBootApplication
public class GrainmarketProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GrainmarketProductApplication.class, args);
    }
}
