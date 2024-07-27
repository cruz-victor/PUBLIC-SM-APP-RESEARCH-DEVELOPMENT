
package com.ubicuosoft.devicesservice.model.dto.response.MessageResponse.deviceMessage;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Review {

    private LocalDateTime date;
    private String state;
    private String observation;

}
