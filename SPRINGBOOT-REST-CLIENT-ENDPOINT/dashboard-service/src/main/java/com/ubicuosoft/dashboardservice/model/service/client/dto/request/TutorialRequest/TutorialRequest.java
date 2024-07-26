package com.ubicuosoft.dashboardservice.model.service.client.dto.request.TutorialRequest;

import com.ubicuosoft.dashboardservice.model.service.client.dto.request.UserActionRequest.UserActionRequest;
import lombok.Data;

@Data
public class TutorialRequest {
    private Tutorial tutorial;
    private UserActionRequest userAction;
}
