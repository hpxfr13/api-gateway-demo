package com.microservices.client.model;

import lombok.Data;

@Data
public class ResponseModel {

    private String tittle;
    private String platform;
    private String usedFor;
    private Short serverPort;
    private String message;

}
