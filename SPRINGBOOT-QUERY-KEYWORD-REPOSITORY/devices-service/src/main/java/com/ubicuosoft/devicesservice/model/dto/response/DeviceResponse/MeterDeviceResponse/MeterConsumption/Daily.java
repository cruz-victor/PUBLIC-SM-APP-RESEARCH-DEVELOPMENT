package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterConsumption;

import lombok.Data;

@Data
public class Daily {

    private Integer year;
    private Integer month;
    private Integer day;
    private Double consumption;
    private String unit;

}
