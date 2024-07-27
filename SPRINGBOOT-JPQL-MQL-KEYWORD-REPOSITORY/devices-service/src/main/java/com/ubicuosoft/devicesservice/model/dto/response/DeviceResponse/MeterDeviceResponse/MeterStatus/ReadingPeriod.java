package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterStatus;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReadingPeriod {
    private String uuid;
    private LocalDateTime date;
    private String period;
    private String periodShort;
}
