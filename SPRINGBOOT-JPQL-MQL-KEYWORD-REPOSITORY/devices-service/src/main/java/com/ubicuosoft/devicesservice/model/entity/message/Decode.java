package com.ubicuosoft.devicesservice.model.entity.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Decode {
    @Field("key")
    private String key;
    @Field("value")
    private String value;
    @Field("unit")
    private String unit;
}
