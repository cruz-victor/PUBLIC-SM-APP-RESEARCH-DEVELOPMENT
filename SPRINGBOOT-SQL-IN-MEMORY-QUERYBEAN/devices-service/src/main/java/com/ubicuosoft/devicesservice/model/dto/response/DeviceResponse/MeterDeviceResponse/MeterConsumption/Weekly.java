package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterConsumption;

import lombok.Data;

@Data
public class Weekly {

    private Integer year;
    private Integer month;
    private Integer week;
    private Double consumption;
    private String unit;

}
