package com.microservice.apigateway.config;

import com.microservice.apigateway.model.response.GatewayClientResponse;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

@Component
public class ZuulFallbackConfig {

    /*@Bean
    public FallbackProvider zuulFallbackProvider() {
        return new FallbackProvider() {
            @Override
            public String getRoute() {
                // Return "*" to apply the default fallback to all routes
                return "*";
            }

            @Override
            public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
                // Return the fallback command as the response
                //return new GatewayClientResponse(HttpStatus.GATEWAY_TIMEOUT, "Service is down!", cause.getMessage(), route);
            }
        };
    }*/
}