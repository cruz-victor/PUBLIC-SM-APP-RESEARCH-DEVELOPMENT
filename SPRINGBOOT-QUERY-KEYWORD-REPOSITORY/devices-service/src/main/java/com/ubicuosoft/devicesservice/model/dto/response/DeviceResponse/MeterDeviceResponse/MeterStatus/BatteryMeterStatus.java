package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterStatus;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BatteryMeterStatus {
    private String uuid;
    private LocalDateTime date;
    private String percentage;
    private String rating;
}
