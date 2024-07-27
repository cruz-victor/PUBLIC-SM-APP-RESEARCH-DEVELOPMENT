package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse;

import com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterConsumption.MeterConsumption;
import com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterInformation.MeterInformation;
import com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterStatus.MeterStatus;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DetailedMeterData {
    private MeterInformation information;//dis.DEVICE.information
    private MeterStatus status;//service retriveMeterStatus(). Implementar. Consultar datos de Mongodb
    private MeterLocation location; //endpoint  GET /map/api/v2/locations/{id_device} location-service
    private MeterConsumption consumption; //service retriveMeterConsumption(). Implementar. Consultar datos de Mongodb
}
