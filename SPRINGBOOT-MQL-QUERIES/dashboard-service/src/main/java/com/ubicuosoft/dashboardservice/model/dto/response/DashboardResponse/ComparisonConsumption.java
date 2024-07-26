package com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ComparisonConsumption{
    private Integer year;
    private String yearColor;
    private List<Integer> month;

}
