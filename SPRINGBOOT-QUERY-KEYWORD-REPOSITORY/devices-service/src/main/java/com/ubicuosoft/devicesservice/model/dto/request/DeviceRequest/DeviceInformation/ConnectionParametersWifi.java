
package com.ubicuosoft.devicesservice.model.dto.request.DeviceRequest.DeviceInformation;

import lombok.Data;

@Data
public class ConnectionParametersWifi {
    private String ssid;
    private String securityKey;
    private EncryptionProtocol encryptionProtocol;
}
