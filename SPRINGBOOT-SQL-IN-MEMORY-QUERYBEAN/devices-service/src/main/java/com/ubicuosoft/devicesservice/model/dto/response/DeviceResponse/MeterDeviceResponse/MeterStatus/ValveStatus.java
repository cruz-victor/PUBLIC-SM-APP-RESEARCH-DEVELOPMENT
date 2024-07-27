package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterStatus;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ValveStatus {
    private String uuid;
    private LocalDateTime date;
    private String state;
}
