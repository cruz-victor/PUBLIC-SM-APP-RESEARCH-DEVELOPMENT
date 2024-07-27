package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse;

import lombok.Data;

@Data
public class GatewayCountResponse {
    private long total;
    private long totalOnline;
    private long totalOffline;
}
