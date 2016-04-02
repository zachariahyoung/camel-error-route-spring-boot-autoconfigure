package com.zandroid.camel.error;


import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CamelErrorRouteProperties.class)
public class ErrorRoute extends RouteBuilder {

    @Autowired
    private CamelErrorRouteProperties camelErrorRouteProperties;

    @Override
    public void configure() throws Exception {
        from(camelErrorRouteProperties.getInUrl()).routeId("errorRoute")
                .log(LoggingLevel.ERROR,"test")
                .to(camelErrorRouteProperties.getOutUrl());
    }
}
