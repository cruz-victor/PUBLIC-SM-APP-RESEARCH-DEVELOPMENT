package com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class TotalDevices {
    private Gateways gateways;
    private Meters meters;
}
