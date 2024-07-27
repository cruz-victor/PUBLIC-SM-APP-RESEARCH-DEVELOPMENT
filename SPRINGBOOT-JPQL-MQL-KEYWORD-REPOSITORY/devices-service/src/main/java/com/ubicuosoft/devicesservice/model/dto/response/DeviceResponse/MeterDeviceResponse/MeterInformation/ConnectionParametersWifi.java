
package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterInformation;

import lombok.Data;

@Data
public class ConnectionParametersWifi {
    private String ssid;
    private String securityKey;
    private EncryptionProtocol encryptionProtocol;
}
