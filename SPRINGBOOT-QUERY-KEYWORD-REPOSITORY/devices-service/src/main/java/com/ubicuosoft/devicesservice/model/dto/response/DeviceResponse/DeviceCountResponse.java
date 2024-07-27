package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse;

import lombok.Data;

@Data
public class DeviceCountResponse {
    private MeterCountResponse meterCountResponse;
    private GatewayCountResponse gatewayCountResponse;
}
