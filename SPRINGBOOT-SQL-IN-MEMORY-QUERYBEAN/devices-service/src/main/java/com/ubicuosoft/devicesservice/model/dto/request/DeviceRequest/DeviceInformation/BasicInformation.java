
package com.ubicuosoft.devicesservice.model.dto.request.DeviceRequest.DeviceInformation;

import lombok.Data;

@Data
public class BasicInformation {
    private Brand brand;
    private Model model;
    private State state;
    private Device device;
}
