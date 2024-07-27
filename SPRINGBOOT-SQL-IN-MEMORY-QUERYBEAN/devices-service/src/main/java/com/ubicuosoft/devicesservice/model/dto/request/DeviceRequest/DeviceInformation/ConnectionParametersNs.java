
package com.ubicuosoft.devicesservice.model.dto.request.DeviceRequest.DeviceInformation;

import lombok.Data;

@Data
public class ConnectionParametersNs {
    private Class clase;
    private String deveui;
    private Region region;
    private Subband subband;
    private String gatewayid;
}
