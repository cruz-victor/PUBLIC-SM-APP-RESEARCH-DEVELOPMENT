
package com.ubicuosoft.devicesservice.model.dto.response.MessageResponse.deviceMessage;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class DeviceMessage {
    private String uuid; //message_mongodb.uuid
    private LocalDateTime timestamp; //message_mongodb.timestamp
    private Device device; //message_mongodb.device
    private MessageDescription message; //message_mongodb.message
    private Payload payload; //message_mongodb.payload
    private Communication_ communication; //message_mongodb.communication
}
