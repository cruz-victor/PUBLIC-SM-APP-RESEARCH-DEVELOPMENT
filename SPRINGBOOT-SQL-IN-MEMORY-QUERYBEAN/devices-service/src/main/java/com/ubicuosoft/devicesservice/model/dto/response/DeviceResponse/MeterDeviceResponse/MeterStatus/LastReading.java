package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterStatus;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LastReading {
    private String uuid;
    private LocalDateTime date;
    private String consumption;
    private String units;
}
