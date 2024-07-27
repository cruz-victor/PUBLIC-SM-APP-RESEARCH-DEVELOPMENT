
package com.ubicuosoft.devicesservice.model.dto.request.DeviceRequest.DeviceInformation;

import lombok.Data;

import java.util.List;

@Data
public class TechnicalSpecificationsGateway {
    private Type type;
    private Channels channels;
    private List<Communication> communications;
}
