package com.ubicuosoft.dashboardservice.model.service.del.client;

import lombok.Data;

@Data
public class DeviceCount {
    private DeviceCount gatewayCountResponse;
    private MeterCount meterCountResponse;
}
