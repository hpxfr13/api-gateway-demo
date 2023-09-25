package com.microservices.server.service;

import com.microservices.server.model.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ServerService {

    @Autowired
    private Environment environment;

    public String getTechnologyInfo(String platform){
        ResponseModel responseModel = new ResponseModel();

        if (platform.equalsIgnoreCase("Java")) {
            responseModel.setTittle("Technology Stack");
            responseModel.setPlatform("Java");
            responseModel.setUsedFor("Secured Web Services");
        } else if (platform.equalsIgnoreCase("python")) {
            responseModel.setTittle("Technology Stack");
            responseModel.setPlatform("python");
            responseModel.setUsedFor("Machine Learning");
        } else {
            responseModel.setTittle("Technology Stack");
            responseModel.setPlatform(platform);
            responseModel.setUsedFor("Unknown platform");
        }

        responseModel.setServerPort(Short.parseShort(environment.getProperty("local.server.port")));
        return responseModel.toString();
    }

}
