
package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse.GatewayInformation;

import lombok.Data;

@Data
public class ConnectionParametersCat {
    private Class clase;
    private String appeui;
    private String appkey;
    private String deveui;
    private Region region;
    private Subband subband;
    private AuthenticationType authenticationType;
}
