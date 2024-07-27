
package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterInformation;

import lombok.Data;

@Data
public class ConnectionParametersLan {
    private String address;
    private String gateway;
    private String netmask;
}
