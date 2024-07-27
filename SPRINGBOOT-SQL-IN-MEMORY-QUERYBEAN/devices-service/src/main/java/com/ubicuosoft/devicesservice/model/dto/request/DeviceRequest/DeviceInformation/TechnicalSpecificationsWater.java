
package com.ubicuosoft.devicesservice.model.dto.request.DeviceRequest.DeviceInformation;

import lombok.Data;

import java.util.List;

@Data
public class TechnicalSpecificationsWater {
    private Type type;
    private Control control;
    private Diameter diameter;
    private List<Communication> communications;

}
