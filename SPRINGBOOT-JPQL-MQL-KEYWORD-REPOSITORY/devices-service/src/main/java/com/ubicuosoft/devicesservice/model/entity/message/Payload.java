package com.ubicuosoft.devicesservice.model.entity.message;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Payload {
    @Field("decode")
    private List<Decode> decode;
}
