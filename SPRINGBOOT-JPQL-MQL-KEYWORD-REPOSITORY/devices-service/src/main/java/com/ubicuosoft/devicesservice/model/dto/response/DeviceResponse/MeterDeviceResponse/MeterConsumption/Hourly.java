package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterConsumption;

import lombok.Data;

@Data
public class Hourly {

    private Integer year;
    private Integer month;
    private Integer day;
    private Integer hour;
    private Double consumption;
    private String unit;

}
