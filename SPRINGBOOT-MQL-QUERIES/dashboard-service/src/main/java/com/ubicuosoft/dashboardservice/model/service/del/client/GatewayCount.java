package com.ubicuosoft.dashboardservice.model.service.del.client;

import lombok.Data;

@Data
public class GatewayCount {
    private long total;
    private long totalOnline;
    private long totalOffline;
}
