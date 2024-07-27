package com.ubicuosoft.devicesservice.model.entity.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document
public class Message {
    @Id
    private String uuid;
    private String timestamp;
    private DeviceMessage device;
    private MessageContent   message;
    private Payload payload;
    private Communication communication;
}
