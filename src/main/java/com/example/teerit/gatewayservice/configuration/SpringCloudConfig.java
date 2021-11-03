package com.example.teerit.gatewayservice.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation .Bean;
import org.springframework.context.annotation.Configuration;

/* Bean configuration for Spring Cloud Gateway */
@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("ีuser-service", rt -> rt.path("/users/**")
                        .uri("http://localhost:8020/"))
                .route("account-service", rt -> rt.path("/account/**")
                        .uri("http://localhost:8030"))
                .build();
    }
}
