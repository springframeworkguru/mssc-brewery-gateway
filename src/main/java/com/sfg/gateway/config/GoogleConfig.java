package com.sfg.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * Created by jt on 3/5/20.
 */
//@Profile("google")
//@Configuration
public class GoogleConfig {

    /**
     * This is just an example of routing requests to Google from localhost. For demonstration only
     * @param builder
     * @return
     */
    @Bean
    public RouteLocator googleRouteConfig(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r -> r.path("/googlesearch2")
                        .filters(f -> f.rewritePath("/googlesearch2(?<segment>/?.*)", "/${segment}"))
                .uri("https://google.com")
                .id("google"))
                .build();
    }
}
