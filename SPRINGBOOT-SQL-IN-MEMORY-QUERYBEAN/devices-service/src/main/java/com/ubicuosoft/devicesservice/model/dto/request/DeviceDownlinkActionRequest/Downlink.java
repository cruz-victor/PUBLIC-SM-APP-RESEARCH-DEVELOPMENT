package com.ubicuosoft.devicesservice.model.dto.request.DeviceDownlinkActionRequest;

import lombok.Data;

@Data
public class Downlink {
    private String event;
    private String type;
    private Integer executionPeriod;
    private String state;
    private Long idDevice;
}
