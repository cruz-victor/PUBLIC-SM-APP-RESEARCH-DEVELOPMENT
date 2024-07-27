package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse;

import com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse.GatewayInformation.GatewayInformation;
import com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse.GatewayStatus.GatewayStatus;
import com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse.GatewayTraffic.GatewayTraffic;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DetailedGatewayData {
    private GatewayInformation information; //dis.DEVICE.information
    private GatewayStatus status; //service retriveMeterStatus(). Implementar. Consultar datos de Mongodb
    private GatewayLocation location; //endpoint  GET /map/api/v2/locations/{id_device} location-service
    private GatewayTraffic traffic; //service retriveGatewayTraffic(). Implementar. Consultar datos de Mongodb
}
