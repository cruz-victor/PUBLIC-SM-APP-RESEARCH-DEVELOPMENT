package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class GeneralMeterData {
    private String meterNumber;//dis.DEVICE.information.basicInformation.code
    private String valveState; //service retriveMeterStatus(). Implementar. Consultar datos de Mongodb
    private String meterState; //dis.DEVICE.information.basicInformation.state.value
    private String meterStateColor;//service getMeterStateColor(). Implementar en backend.
    private LocalDateTime lastMeterReadingDate;//service retriveLastMeterReadingDate(). Implementar. Consultar datos de Mongodb
    private String meterType; //dis.DEVICE.information.basicInformation.device.type
}
