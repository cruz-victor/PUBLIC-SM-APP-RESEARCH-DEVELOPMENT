package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class GeneralGatewayData {
    private String gatewayNumber;//dis.DEVICE.information.basicInformation.code
    private String gatewayName;//dis.DEVICE.information.basic_information.brand.value
    private String gatewayType;//dis.DEVICE.information.technicalSpecificationsGateway.type.value
    private LocalDateTime lastGatewayConnectionDate; //endpoint  GET /shared/api/v2/timestamp shared-service
    private String gatewayState;//dis.DEVICE.information.basicInformation.state.value
    private String gatewayStateColor;//service getGatewayStateColor(). Implementar en backend.
}
