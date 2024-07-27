package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterStatus;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LastAlert {
    private String uuid;
    private String type;
    private LocalDateTime date;
    private String hexadecimalColor;
}
