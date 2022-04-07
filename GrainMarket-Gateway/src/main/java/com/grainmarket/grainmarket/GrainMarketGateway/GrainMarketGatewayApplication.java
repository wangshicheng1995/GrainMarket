package com.grainmarket.grainmarket.GrainMarketGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GrainMarketGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrainMarketGatewayApplication.class, args);
	}

}
