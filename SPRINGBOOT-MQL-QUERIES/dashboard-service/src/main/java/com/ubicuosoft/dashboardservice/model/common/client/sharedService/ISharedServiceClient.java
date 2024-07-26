package com.ubicuosoft.dashboardservice.model.common.client.sharedService;

import com.ubicuosoft.dashboardservice.model.service.del.client.TimestampResponse;

public interface ISharedServiceClient {
    TimestampResponse getTimestamp();
}
