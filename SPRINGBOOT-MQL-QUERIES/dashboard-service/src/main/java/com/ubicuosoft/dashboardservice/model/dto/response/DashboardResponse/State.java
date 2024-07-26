package com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse;

import lombok.Data;

@Data
public class State {
    private String state;
    private Integer totalDevices;
    private String stateColor;
}
