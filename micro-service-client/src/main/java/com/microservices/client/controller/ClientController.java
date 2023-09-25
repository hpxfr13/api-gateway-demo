package com.microservices.client.controller;

import com.microservices.client.service.ApiProxy;
import feign.Headers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ApiProxy apiProxy;

    @GetMapping("/technologyInfo/{platform}")
    @Headers("Content-Type: application/json")
    public ResponseEntity getTechnologyInfo(@RequestHeader(HttpHeaders.AUTHORIZATION) String bearerToken, @PathVariable("platform") String platform) {

        // API calling using proxy interface and mapping into ResponseModel named Object.
        return ResponseEntity.ok(apiProxy.retrieveTechnologyInfo(bearerToken, platform));
    }
}
