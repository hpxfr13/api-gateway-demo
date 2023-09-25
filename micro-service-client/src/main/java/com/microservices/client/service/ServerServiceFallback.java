package com.microservices.client.service;

import com.microservices.client.model.ResponseModel;
import org.springframework.stereotype.Component;

@Component
public class ServerServiceFallback implements ApiProxy {
    @Override
    public String retrieveTechnologyInfo(String bearerToken, String platform) {
        return "Circuit Breaker is enabled! Service will be back shortly.";
    }
}
