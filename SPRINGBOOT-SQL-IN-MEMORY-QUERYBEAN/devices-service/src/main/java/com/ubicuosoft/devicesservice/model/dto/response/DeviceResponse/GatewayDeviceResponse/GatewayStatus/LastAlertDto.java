package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse.GatewayStatus;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LastAlertDto {
    private String uuid;
    private String type;
    private LocalDateTime date;
    private String hexadecimalColor;
}
