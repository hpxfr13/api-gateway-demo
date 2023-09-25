package com.microservices.server.model;

import lombok.Data;
import lombok.ToString;

@Data
public class ResponseModel {

    private String tittle;
    private String platform;
    private String usedFor;
    private Short serverPort;
    private String message;

    @Override
    public String toString() {
        return "ResponseModel{" +
                "tittle='" + tittle + '\'' +
                ", platform='" + platform + '\'' +
                ", usedFor='" + usedFor + '\'' +
                ", serverPort=" + serverPort +
                ", message='" + message + '\'' +
                '}';
    }
}
