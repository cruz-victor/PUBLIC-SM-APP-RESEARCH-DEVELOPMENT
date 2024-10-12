package com.ubicuosoft.devicesservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeviceDto {
    private Long id;
    private String type;
    private String information;
    private String state;
    private String recordState;
    private String history;
    private Long idDeviceDatasheet;
}
