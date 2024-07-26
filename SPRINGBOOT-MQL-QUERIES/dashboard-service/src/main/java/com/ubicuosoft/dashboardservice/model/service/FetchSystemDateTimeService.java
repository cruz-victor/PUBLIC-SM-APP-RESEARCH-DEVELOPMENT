package com.ubicuosoft.dashboardservice.model.service;

import com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse.Device;
import com.ubicuosoft.dashboardservice.model.service.client.WebClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class FetchSystemDateTimeService {
    private final WebClientService webClientService;

    public LocalDateTime execute() {
        Object response= webClientService.execute("http://localhost", HttpMethod.GET, "8080",null, Device.class);
        throw new UnsupportedOperationException();
    }
}
