package com.ubicuosoft.dashboardservice.model.dto.request.TutorialRequest;

import com.ubicuosoft.dashboardservice.model.dto.request.UserActionRequest.UserActionRequest;
import lombok.Data;

@Data
public class TutorialRequest {
    private Tutorial tutorial;
    private UserActionRequest userAction;
}
