package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse;

import lombok.Data;

@Data
public class MeterCountResponse {
    private long total;
    private long totalWorking;
    private long totalOtherStates;
}
