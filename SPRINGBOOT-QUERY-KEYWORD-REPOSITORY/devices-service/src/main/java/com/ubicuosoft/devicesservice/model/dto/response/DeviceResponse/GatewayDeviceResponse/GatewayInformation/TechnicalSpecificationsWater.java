
package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse.GatewayInformation;

import lombok.Data;

import java.util.List;

@Data
public class TechnicalSpecificationsWater {
    private Type type;
    private Control control;
    private Diameter diameter;
    private List<Communication> communications;

}
