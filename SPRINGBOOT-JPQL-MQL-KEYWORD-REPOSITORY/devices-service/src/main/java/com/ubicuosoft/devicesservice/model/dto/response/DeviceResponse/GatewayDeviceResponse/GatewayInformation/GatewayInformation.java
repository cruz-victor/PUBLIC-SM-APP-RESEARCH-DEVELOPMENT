
package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse.GatewayInformation;

import lombok.Data;

@Data
public class GatewayInformation {
    private BasicInformation basicInformation;
    private TechnicalSpecificationsWater technicalSpecificationsWater;
    private TechnicalSpecificationsElectricity technicalSpecificationsElectricity;
    private TechnicalSpecificationsGas technicalSpecificationsGas;
    private TechnicalSpecificationsGateway technicalSpecificationsGateway;
    private ConnectionParameters4g connectionParameters4g;
    private ConnectionParametersCat connectionParametersCat;
    private ConnectionParametersWifi connectionParametersWifi;
    private ConnectionParametersLan connectionParametersLan;
    private Server server;
    private ConnectionParametersNs connectionParametersNs;
}
