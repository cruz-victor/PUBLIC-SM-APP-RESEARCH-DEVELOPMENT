
package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterInformation;

import lombok.Data;

import java.util.List;

@Data
public class TechnicalSpecificationsElectricity {
    private Type type;
    private Wire wire;
    private Control control;
    private Current current;
    private Voltage voltage;
    private Frequency frequency;
    private List<Communication> communications;
}
