package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse;

import com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.DeviceResponse;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Builder
@Data
@EqualsAndHashCode(callSuper=false)
public class GatewayDeviceResponse extends DeviceResponse {
    private List<GatewayDevice> devices;
}