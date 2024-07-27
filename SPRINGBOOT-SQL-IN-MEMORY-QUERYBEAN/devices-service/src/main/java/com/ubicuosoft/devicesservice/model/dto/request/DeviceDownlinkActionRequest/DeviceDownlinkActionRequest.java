package com.ubicuosoft.devicesservice.model.dto.request.DeviceDownlinkActionRequest;

import com.ubicuosoft.devicesservice.model.dto.request.UserActionRequest.UserActionRequest;
import lombok.Data;

@Data
public class DeviceDownlinkActionRequest {
    private Downlink downlink;
    private UserActionRequest userAction;
}
