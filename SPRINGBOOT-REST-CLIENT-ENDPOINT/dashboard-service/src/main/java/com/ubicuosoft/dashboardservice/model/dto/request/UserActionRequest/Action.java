
package com.ubicuosoft.dashboardservice.model.dto.request.UserActionRequest;

import lombok.Data;

@Data
public class Action {
    private String event;
    private String motive;
}
