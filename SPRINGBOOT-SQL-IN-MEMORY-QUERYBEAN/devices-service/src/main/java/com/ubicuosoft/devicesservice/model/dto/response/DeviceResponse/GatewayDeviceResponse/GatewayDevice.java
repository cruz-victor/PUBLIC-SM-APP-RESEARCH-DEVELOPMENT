package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GatewayDevice {
    private Long idDevice; //dis.DEVICE.id
    private String typeDevice; //dis.DEVICE.type (con.SETTING.company)
    private GeneralGatewayData generalData;
    private DetailedGatewayData detailedData;
}
