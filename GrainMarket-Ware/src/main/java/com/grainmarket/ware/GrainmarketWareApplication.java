package com.grainmarket.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.grainmarket.ware.dao")
@SpringBootApplication
public class GrainmarketWareApplication {
    public static void main(String[] args) {
        SpringApplication.run(GrainmarketWareApplication.class, args);
    }
}
