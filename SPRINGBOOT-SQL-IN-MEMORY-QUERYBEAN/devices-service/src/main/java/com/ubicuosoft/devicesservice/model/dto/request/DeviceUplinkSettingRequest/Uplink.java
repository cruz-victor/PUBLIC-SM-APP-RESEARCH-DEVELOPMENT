package com.ubicuosoft.devicesservice.model.dto.request.DeviceUplinkSettingRequest;

import lombok.Data;

@Data
public class Uplink {
    private String event;
    private String type;
    private Integer executionPeriod;
    private String state;
    private Long idDevice;
}
