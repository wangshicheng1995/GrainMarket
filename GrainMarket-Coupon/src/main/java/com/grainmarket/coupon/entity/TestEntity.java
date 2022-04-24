package com.grainmarket.coupon.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author echo
 * @version 1.0
 * @date 2022/4/16 17:42
 */
@Data
@PropertySource(value = "classpath:muyan.properties", encoding = "UTF-8")
@ConfigurationProperties(prefix = "muyan")
@Component
public class TestEntity {
    private String mysql;
    private String redis;
    private List<String> messages;
}
