package com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TotalDevicesStates {
    List<State> states;
}
