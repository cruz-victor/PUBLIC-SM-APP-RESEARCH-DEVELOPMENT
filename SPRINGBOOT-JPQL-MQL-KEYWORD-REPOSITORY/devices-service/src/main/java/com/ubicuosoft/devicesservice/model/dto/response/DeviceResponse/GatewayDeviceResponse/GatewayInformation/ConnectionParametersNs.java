
package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse.GatewayInformation;

import lombok.Data;

@Data
public class ConnectionParametersNs {
    private Class clase;
    private String deveui;
    private Region region;
    private Subband subband;
    private String gatewayid;
}
