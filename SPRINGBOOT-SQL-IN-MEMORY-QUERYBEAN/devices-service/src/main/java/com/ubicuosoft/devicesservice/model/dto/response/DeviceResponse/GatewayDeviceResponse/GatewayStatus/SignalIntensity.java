package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse.GatewayStatus;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SignalIntensity {
    private String uuid;
    private LocalDateTime date;
    private String intensity;
    private String rating;
}
