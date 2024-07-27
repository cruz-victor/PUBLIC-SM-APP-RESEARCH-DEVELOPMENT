
package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterConsumption;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MeterConsumption {
    private Boolean isAvailable;
    private LocalDateTime timestamp;
    private EnergyConsumption energyConsumption;
}
