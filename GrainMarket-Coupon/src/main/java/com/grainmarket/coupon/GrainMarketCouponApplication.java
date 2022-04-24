package com.grainmarket.coupon;

import com.grainmarket.member.config.MyImportBeanDefinitionRegistrar;
import com.grainmarket.member.config.MySelectImportor;
import com.grainmarket.member.entity.MemberEntity;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;


@EnableDiscoveryClient
@MapperScan("com.grainmarket.coupon.dao")
@SpringBootApplication
@Import(MyImportBeanDefinitionRegistrar.class)
public class GrainMarketCouponApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(GrainMarketCouponApplication.class, args);

        Object member = context.getBean(MemberEntity.class);
        System.out.println(member);
    }
}
