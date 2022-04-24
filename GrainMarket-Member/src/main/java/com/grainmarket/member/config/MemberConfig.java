package com.grainmarket.member.config;

import com.grainmarket.member.entity.MemberEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 用于测试 @ComponentScan 注解所写
 * @author echo
 * @version 1.0
 * @date 2022/4/17 17:44
 */
@Configuration
public class MemberConfig {

    @Bean("MemberEntity")
    public MemberEntity member() {
        return new MemberEntity();
    }
}
