package com.ubicuosoft.dashboardservice.model.service.del.client;

import lombok.Data;

@Data
public class MeterCount {
    private long total;
    private long totalWorking;
    private long totalOtherStates;
}
