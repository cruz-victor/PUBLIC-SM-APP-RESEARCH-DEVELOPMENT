
package com.ubicuosoft.dashboardservice.model.dto.request.UserActionRequest;

import lombok.Data;

@Data
public class UserActionRequest {
    private User user;
    private Action action;
}
