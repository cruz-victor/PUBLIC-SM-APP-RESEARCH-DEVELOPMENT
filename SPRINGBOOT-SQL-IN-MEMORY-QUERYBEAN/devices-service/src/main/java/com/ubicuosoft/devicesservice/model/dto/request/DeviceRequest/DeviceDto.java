package com.ubicuosoft.devicesservice.model.dto.request.DeviceRequest;

import com.ubicuosoft.devicesservice.model.dto.request.DeviceRequest.DeviceInformation.DeviceInformation;
import lombok.Data;

@Data
public class DeviceDto {
    private String type; //dis.DEVICE.type
    private DeviceInformation information; //dis.DEVICE.information (convertir a json)
    private String state; //dis.DEVICE.state
    private Long idDeviceDatasheet; //dis.DEVICE.id_device_datasheet
}
