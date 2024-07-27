package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterConsumption;

import lombok.Data;

import java.util.List;

@Data
public class EnergyConsumption {
    private List<Yearly> yearly;
    private List<Monthly> monthly;
    private List<Weekly> weekly;
    private List<Daily> daily;
    private List<Hourly> hourly;
}
