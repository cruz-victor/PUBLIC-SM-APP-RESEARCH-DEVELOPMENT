package com.ubicuosoft.dashboardservice.model.common.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class SpecificExceptionHandler extends RuntimeException {
    private HttpStatus errorCode;
    private String errorMessage;

    public SpecificExceptionHandler(HttpStatus errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}