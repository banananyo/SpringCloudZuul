package com.springboot.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableZuulProxy
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulApiGatewayApplication.class, args);
	}

	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}
}

