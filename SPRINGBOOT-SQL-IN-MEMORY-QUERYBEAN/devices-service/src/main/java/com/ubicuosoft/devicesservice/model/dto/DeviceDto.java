package com.ubicuosoft.devicesservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeviceDto {
    private String type;
    private String information;
    private String state;
    private String recordState;
    private String history;
    private Long idDeviceDatasheet;
}
