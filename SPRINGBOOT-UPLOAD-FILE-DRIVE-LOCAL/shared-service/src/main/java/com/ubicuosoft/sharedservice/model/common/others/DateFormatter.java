package com.ubicuosoft.sharedservice.model.common.others;

import com.ubicuosoft.sharedservice.model.common.exception.SpecificExceptionHandler;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static LocalDateTime parseDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        try{
            return LocalDateTime.parse(date, formatter);
        }catch (Exception e){
            throw new SpecificExceptionHandler(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }
}
