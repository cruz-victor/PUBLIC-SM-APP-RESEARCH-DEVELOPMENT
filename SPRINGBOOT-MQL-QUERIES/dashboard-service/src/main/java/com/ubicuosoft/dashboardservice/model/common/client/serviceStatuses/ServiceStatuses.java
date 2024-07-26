package com.ubicuosoft.dashboardservice.model.common.client.serviceStatuses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ServiceStatuses implements IServiceStatuses {

    @Autowired
    private RestTemplate restTemplate;

    public Boolean getAccountsServiceStatus() {
        return restTemplate.getForObject("http://localhost:8085/actuator/health", Boolean.class);
    }

    public Boolean getDevicesServiceStatus() {
        return restTemplate.getForObject("http://localhost:8093/actuator/health", Boolean.class);
    }

    public Boolean getHelpCenterServiceStatus() {
        return restTemplate.getForObject("http://localhost:9096/actuator/health", Boolean.class);
    }

    public Boolean getLocationsServiceStatus() {
        return restTemplate.getForObject("http://localhost:9093/actuator/health", Boolean.class);
    }

    public Boolean getReportServiceStatus() {
        return restTemplate.getForObject("http://localhost:9095/actuator/health", Boolean.class);
    }

    public Boolean getSettingsServiceStatus() {
        return restTemplate.getForObject("http://localhost:8082/actuator/health", Boolean.class);
    }

    public Boolean getSharedServiceStatus() {
        return restTemplate.getForObject("http://localhost:9098/actuator/health", Boolean.class);
    }

    public boolean getServiceStatuses () {
        try {
            return getAccountsServiceStatus() && getDevicesServiceStatus() && getHelpCenterServiceStatus()
                    && getLocationsServiceStatus() && getReportServiceStatus() && getSettingsServiceStatus()
                    && getSharedServiceStatus();
        } catch (Exception e) {
            return false;
        }
    }
}
