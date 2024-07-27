package com.ubicuosoft.devicesservice.model.dto.request.DeviceUplinkSettingRequest;

import com.ubicuosoft.devicesservice.model.dto.request.UserActionRequest.UserActionRequest;
import lombok.Data;

@Data
public class DeviceUplinkSettingRequest {
    private Uplink uplink;
    private UserActionRequest userAction;
}
