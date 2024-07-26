package com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LastAlert {
    private String uuid;
    private String type;
    private String date;
    private String alertColor;
}
