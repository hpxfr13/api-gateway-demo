package com.microservices.server.controller;


import com.microservices.server.model.ResponseModel;
import com.microservices.server.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/server")
public class ServerController {

    @Autowired
    private Environment environment;

    @Autowired
    ServerService serverService;

    @GetMapping("/technologyInfo/{platform}")
    public String retrieveTechnologyInfo(@PathVariable("platform") String platform) {
        return serverService.getTechnologyInfo(platform);
    }
}
