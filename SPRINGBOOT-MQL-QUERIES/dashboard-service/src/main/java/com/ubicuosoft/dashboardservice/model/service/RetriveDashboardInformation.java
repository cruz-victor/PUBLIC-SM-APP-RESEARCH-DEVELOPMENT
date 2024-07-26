package com.ubicuosoft.dashboardservice.model.service;

import com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class RetriveDashboardInformation {
    private final CalculateTotalDeviceCountService      calculateTotalDeviceCountService;
    private final CompareConsumptionLastTwoYearsService compareConsumptionLastTwoYearsService;
    private final DetermineDeviceStateCountsService     determineDeviceStateCountsService;
    private final FetchCurrentSystemStatusService       fetchCurrentSystemStatusService;
    private final FetchDeviceCoordinatesService         fetchDeviceCoordinatesService;
    private final FetchRecentDeviceAlertsService        fetchRecentDeviceAlertsService;
    private final FetchRecentDeviceReadingsService      fetchRecentDeviceReadingsService;
    private final FetchSystemDateTimeService            fetchSystemDateTimeService;

//        1.    fetchSystemDateTime()
//        2.    fetchCurrentSystemStatus()
//        3.    calculateTotalDeviceCount()
//        4.    determineDeviceStateCounts()
//        5.    fetchDeviceCoordinates()
//        6.    compareConsumptionLastTwoYears()
//        7.    fetchRecentDeviceAlerts()
//        8.    fetchRecentDeviceReadings()
//        9.    buildDashboardResponse()
    public DashboardResponse execute() {
        LocalDateTime               timestamp             = fetchSystemDateTimeService.execute      ();
        Boolean                     isLive                = fetchCurrentSystemStatusService.execute ();
        TotalDevices                totalDevices          = calculateTotalDeviceCountService.execute();
        TotalDevicesStates          totalDevicesStates    = determineDeviceStateCountsService.execute();
        List<DeviceCoordinates>     devicesCoordinates    = fetchDeviceCoordinatesService.execute   ();
        List<ComparisonConsumption> comparisonConsumption = compareConsumptionLastTwoYearsService.execute();
        List<LastAlert>             lastAlerts            = fetchRecentDeviceAlertsService.execute  ();
        List<LastReading>           lastReadings          = fetchRecentDeviceReadingsService.execute();

        return buildDashboardResponse(timestamp, isLive, totalDevices, totalDevicesStates, devicesCoordinates, comparisonConsumption, lastAlerts, lastReadings);
    }

    private DashboardResponse buildDashboardResponse(LocalDateTime timestamp, Boolean isLive, TotalDevices totalDevices, TotalDevicesStates totalDevicesStates, List<DeviceCoordinates> devicesCoordinates, List<ComparisonConsumption> comparisonConsumption, List<LastAlert> lastAlerts, List<LastReading> lastReadings) {
        return DashboardResponse.builder()
                .timeStamp(timestamp)
                .live(isLive)
                .totalDevices(totalDevices)
                .totalDevicesStates(totalDevicesStates)
                .devicesCoordinates(devicesCoordinates)
                .comparisonConsumption(comparisonConsumption)
                .lastAlerts(lastAlerts)
                .lastReadings(lastReadings)
                .build();
    }
}
