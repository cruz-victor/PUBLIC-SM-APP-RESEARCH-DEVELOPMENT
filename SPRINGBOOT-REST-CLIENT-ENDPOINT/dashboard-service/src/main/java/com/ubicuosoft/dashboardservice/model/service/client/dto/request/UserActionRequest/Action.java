
package com.ubicuosoft.dashboardservice.model.service.client.dto.request.UserActionRequest;

import lombok.Data;

@Data
public class Action {
    private String event;
    private String motive;
}
