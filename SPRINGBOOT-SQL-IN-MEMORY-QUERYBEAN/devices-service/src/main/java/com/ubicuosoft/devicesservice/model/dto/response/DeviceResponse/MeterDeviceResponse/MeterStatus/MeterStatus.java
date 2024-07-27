package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse.MeterStatus;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class MeterStatus {
    private Boolean isAvailable;
    private LocalDateTime timestamp;
    private LastReading currentReading;
    private List<LastReading> lastReadings;
    private List<LastAlert> lastAlerts;
    private BatteryMeterStatus battery;
    private SignalIntensity signalIntensity;
    private ReadingPeriod readingPeriod;
    private ValveStatus valveStatus;
}
