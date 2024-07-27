package com.ubicuosoft.devicesservice.model.dto.request.DeviceRequest;

import com.ubicuosoft.devicesservice.model.dto.request.UserActionRequest.UserActionRequest;
import lombok.Data;

@Data
public class DeviceRequest {
    private DeviceDto device;
    private Location location;
    private UserActionRequest userAction;
}
