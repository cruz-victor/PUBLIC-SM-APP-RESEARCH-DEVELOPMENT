package com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LastReading {
    private Integer idDevice;
    private String codeDevice;
    private String uuid;
    private String date;
    private String consumption;
    private String units;
}
