package com.ubicuosoft.dashboardservice.model.common.client.sharedService;

import com.ubicuosoft.dashboardservice.model.service.del.client.TimestampResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SharedServiceClient implements ISharedServiceClient {

    private final String apiUrl = "http://localhost:9098/shared/api/v2";

    @Autowired
    private RestTemplate restTemplate;


    public TimestampResponse getTimestamp() {
        return restTemplate.getForObject(apiUrl+"/timestamp", TimestampResponse.class);
    }

    public Boolean getCurrentSystemStatus() {
        return restTemplate.getForObject(apiUrl+"/timestamp", Boolean.class);
    }
}
