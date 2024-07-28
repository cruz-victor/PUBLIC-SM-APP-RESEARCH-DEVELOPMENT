package com.ubicuosoft.devicesservice.model.entity.message;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document(collection = "messages")
@ToString
public class Message {
    @Id
    private String id;

    private String uuid;
    private String timestamp;
    private Device device;
    private MessageDetail message;
    @Field("payload")
    private Payload payload;
    private Communication communication;
}
