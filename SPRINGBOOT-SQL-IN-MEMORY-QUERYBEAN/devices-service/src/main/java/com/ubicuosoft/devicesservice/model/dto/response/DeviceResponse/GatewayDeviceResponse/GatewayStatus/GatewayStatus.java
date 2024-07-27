package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse.GatewayStatus;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class GatewayStatus {
    private Boolean isAvailable;
    private LocalDateTime timestamp;
    private List<LastAlertDto> lastAlerts;
    private BatteryGatewayStatus battery;
    private SignalIntensity signalIntensity;
    private Ram ram;
    private Storage storage;
    private Internet internet;
    private UplinkDownlink uplinkDownlink;

}
