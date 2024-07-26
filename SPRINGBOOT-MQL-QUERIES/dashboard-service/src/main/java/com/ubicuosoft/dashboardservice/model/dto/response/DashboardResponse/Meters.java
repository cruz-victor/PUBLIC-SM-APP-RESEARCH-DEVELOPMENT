package com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Meters{
    private Integer total;
    private Integer totalWorking;
    private Integer totalOtherStates;
}
