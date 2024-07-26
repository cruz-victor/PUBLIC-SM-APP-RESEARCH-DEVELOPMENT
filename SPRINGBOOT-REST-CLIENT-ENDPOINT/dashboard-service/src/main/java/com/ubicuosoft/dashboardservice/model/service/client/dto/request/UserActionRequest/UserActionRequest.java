
package com.ubicuosoft.dashboardservice.model.service.client.dto.request.UserActionRequest;

import lombok.Data;

@Data
public class UserActionRequest {
    private User user;
    private Action action;
}
