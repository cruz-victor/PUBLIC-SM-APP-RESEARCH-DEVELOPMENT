package com.ubicuosoft.dashboardservice.controller;

import com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse.DashboardResponse;
import com.ubicuosoft.dashboardservice.model.service.RetriveDashboardInformation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard/api/v2/panel")
@RequiredArgsConstructor
public class DashboardController {
    private final RetriveDashboardInformation retriveDashboardInformation;

    @GetMapping
    public DashboardResponse getDashboardInformation()
    {
        return retriveDashboardInformation.execute();
    }
}