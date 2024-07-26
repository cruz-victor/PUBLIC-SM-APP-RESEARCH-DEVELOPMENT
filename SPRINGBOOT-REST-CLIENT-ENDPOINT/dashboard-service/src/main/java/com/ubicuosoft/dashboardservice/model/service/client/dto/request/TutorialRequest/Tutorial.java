package com.ubicuosoft.dashboardservice.model.service.client.dto.request.TutorialRequest;

import lombok.Data;

@Data
public class Tutorial {
    private String module;
    private String url;
    private String title;
    private String description;
    private String state;
}
