package com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeviceCoordinates {
    private Double latitude;
    private Double longtude;
    private Double height;
    private Device device;
}
