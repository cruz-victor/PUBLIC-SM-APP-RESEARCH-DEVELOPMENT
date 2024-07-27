package com.ubicuosoft.devicesservice.model.common.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class DevicesException extends RuntimeException{
    private HttpStatus errorCode;
    private String errorMessage;

    public DevicesException(HttpStatus errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
