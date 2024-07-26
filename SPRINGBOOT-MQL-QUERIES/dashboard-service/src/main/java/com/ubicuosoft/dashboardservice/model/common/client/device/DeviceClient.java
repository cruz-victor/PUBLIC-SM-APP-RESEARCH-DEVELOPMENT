package com.ubicuosoft.dashboardservice.model.common.client.device;

import com.ubicuosoft.dashboardservice.model.service.del.client.DeviceCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DeviceClient implements IDeviceClient {

    private final String apiUrl = "http://localhost:8093/devices/api/v2";

    @Autowired
    private RestTemplate restTemplate;

    public DeviceCount getDeviceCount() {
        return restTemplate.getForObject(apiUrl+"/device/count", DeviceCount.class);
    }

    public Object getActiveDevices() {
        return restTemplate.getForObject(apiUrl+"/device/active", Object.class);
    }
}
