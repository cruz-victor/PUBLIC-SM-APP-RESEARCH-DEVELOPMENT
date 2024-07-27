package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterConsumption;

import lombok.Data;

@Data
public class Monthly {

    private Integer year;
    private Integer month;
    private Double consumption;
    private String unit;

}
