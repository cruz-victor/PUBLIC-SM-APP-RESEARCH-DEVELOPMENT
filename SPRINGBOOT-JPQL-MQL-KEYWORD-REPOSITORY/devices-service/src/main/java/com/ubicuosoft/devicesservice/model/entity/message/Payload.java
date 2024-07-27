package com.ubicuosoft.devicesservice.model.entity.message;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Payload {
    private List<Decode> decode;
}
