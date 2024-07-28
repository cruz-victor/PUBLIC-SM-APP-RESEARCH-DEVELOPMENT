package com.ubicuosoft.devicesservice.model.dto;

import com.ubicuosoft.devicesservice.model.entity.message.Payload;
import lombok.Data;

@Data
public class PayloadWrapper {
    private Payload payload;
}
