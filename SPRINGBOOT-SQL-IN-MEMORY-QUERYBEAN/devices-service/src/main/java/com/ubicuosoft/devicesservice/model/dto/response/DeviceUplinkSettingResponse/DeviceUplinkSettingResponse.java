package com.ubicuosoft.devicesservice.model.dto.response.DeviceUplinkSettingResponse;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DeviceUplinkSettingResponse {
    private Long id;
    private String event;
    private String type;
    private Integer executionPeriod;
    private LocalDateTime timestamp;
    private String state;
    private Long idDevice;
}
