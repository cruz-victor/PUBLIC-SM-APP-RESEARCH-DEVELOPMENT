package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterConsumption;

import lombok.Data;

@Data
public class Yearly {

    private Integer year;
    private String consumption;
    private String unit;

}
