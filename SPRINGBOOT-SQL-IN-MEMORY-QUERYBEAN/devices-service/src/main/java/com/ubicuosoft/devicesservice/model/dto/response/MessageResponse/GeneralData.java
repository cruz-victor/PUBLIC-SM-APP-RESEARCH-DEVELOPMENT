package com.ubicuosoft.devicesservice.model.dto.response.MessageResponse;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class GeneralData {
    private String uuidMessage; //message_mongodb.uuid
    private LocalDateTime messageDate; //message_mongodb.timestamp
    private String messageTypeEvent; //message_mongodb.message.type
    private String messageLastState; //message_mongodb.message.changeTracking(x).review.state. Del objeto changeTracking obtner el ultimo estado del array.
}
