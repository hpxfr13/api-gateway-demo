package com.microservices.client.service;

import com.microservices.client.model.ResponseModel;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(name = "api-gateway-server",
fallback = ServerServiceFallback.class)
@RibbonClient(name = "micro-service-server")
public interface ApiProxy {

    @GetMapping("micro-service-server/server/technologyInfo/{platform}")
    String retrieveTechnologyInfo(@RequestHeader(HttpHeaders.AUTHORIZATION) String bearerToken, @PathVariable("platform") String platform);

}
