package com.ubicuosoft.sharedservice.model.common.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(SpecificExceptionHandler.class)
    public ResponseEntity<Map<String,Object>> handleClientException(SpecificExceptionHandler exception){
        return buildErrorResponse(exception.getErrorCode(), exception.getErrorMessage()); //http code 4xx
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String,Object>> handleServerException(Exception exception){
        return buildErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.INTERNAL_SERVER_ERROR+": "+  exception.getMessage()); //http code 5xx
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<Map<String,Object>> handlePathException(NoHandlerFoundException exception){
        return buildErrorResponse(HttpStatus.NOT_FOUND, HttpStatus.NOT_FOUND+": "+ exception.getMessage()); //http code 404
    }

    private ResponseEntity<Map<String, Object>> buildErrorResponse(HttpStatus errorCode, String errorMessage) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        Map<String, Object> errorResponse = new HashMap<>();
        errorResponse.put("timestamp", LocalDateTime.now());
        errorResponse.put("status", errorCode.value());
        errorResponse.put("message", errorMessage);
        errorResponse.put("path", request.getRequestURI());
        return new ResponseEntity<>(errorResponse, errorCode);
    }
}