package com.microservice.apigateway.service;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.stereotype.Component;

@Component
public class DefaultFallbackCommand extends HystrixCommand<String> {

    public DefaultFallbackCommand() {
        super(HystrixCommandGroupKey.Factory.asKey("DefaultFallbackGroup"));
    }

    @Override
    protected String run() {
        // Implement your fallback logic here
        return "Fallback response";
    }
}