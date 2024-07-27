
package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterInformation;

import lombok.Data;

import java.util.List;

@Data
public class TechnicalSpecificationsGateway {
    private Type type;
    private Channels channels;
    private List<Communication> communications;
}
