package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse.GatewayStatus;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UplinkDownlink {
    private LocalDateTime date;
    private Integer totalUplinks;
    private Integer totalDownlinks;
    private Integer totalUplinksDownlinks;
}
