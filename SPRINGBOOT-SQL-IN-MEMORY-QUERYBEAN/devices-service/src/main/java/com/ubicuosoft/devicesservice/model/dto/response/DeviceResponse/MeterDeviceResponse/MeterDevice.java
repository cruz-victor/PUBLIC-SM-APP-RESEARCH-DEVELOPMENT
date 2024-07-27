package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MeterDevice {
    private Long idDevice; //dis.DEVICE.id
    private String typeDevice; //dis.DEVICE.type
    private GeneralMeterData generalData;
    private DetailedMeterData detailedData;
}
