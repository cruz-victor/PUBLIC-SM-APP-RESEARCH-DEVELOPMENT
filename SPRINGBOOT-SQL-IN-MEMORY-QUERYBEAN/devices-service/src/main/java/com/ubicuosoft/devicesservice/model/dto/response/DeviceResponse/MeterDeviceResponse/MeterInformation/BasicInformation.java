
package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterInformation;

import lombok.Data;

@Data
public class BasicInformation {
    private Brand brand;
    private Model model;
    private State state;
    private Device device;
}
