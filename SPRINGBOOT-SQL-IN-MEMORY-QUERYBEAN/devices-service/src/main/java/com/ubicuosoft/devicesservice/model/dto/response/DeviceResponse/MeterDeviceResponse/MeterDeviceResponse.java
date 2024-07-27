package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse;

import com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.DeviceResponse;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Builder
@Data
@EqualsAndHashCode(callSuper=false)
public class MeterDeviceResponse extends DeviceResponse {
    private List<MeterDevice> devices;
}
