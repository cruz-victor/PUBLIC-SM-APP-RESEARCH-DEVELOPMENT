
package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse.GatewayInformation;

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
