
package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse.GatewayInformation;

import lombok.Data;

import java.util.List;

@Data
public class TechnicalSpecificationsGateway {
    private Type type;
    private Channels channels;
    private List<Communication> communications;
}
