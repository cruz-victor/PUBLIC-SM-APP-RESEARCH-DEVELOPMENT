package com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
public class DashboardResponse{
    private LocalDateTime timeStamp; //service retrieveSystemDateTime()
    private Boolean live; //service fetchCurrentSystemStatus()
    private TotalDevices totalDevices;//service calculateTotalDeviceCount()
    private TotalDevicesStates totalDevicesStates;//service determineDeviceStateCounts()
    private List<DeviceCoordinates> devicesCoordinates;//service collectDeviceGeographicalCoordinates()
    private List<ComparisonConsumption> comparisonConsumption; //service compareConsumptionLastTwoYears()
    private List<LastAlert> lastAlerts; //service retrieveRecentDeviceAlerts()
    private List<LastReading> lastReadings;//service retrieveRecentDeviceReadings()
}
