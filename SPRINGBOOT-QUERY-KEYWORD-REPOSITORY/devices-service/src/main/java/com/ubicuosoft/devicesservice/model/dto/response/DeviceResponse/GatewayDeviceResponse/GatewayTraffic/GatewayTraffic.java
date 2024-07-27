package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse.GatewayTraffic;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GatewayTraffic {
    private Boolean isAvailable;
    private LocalDateTime timestamp;
    private MessageTraffic messageTraffic;
}
