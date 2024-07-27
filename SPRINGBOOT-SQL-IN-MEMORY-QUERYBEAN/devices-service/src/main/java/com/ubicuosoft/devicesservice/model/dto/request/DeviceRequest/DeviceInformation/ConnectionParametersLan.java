
package com.ubicuosoft.devicesservice.model.dto.request.DeviceRequest.DeviceInformation;

import lombok.Data;

@Data
public class ConnectionParametersLan {
    private String address;
    private String gateway;
    private String netmask;
}
