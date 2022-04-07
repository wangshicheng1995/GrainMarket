package com.grainmarket.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.grainmarket.order.dao")
@SpringBootApplication
public class GrainmarketOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(GrainmarketOrderApplication.class, args);
    }
}
