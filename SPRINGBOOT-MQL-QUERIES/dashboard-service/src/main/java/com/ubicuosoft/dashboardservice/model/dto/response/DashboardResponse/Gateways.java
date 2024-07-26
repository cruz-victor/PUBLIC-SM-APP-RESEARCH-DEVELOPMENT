package com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Gateways {
    private Integer total;
    private Integer totalOnline;
    private Integer totalOffline;
}
