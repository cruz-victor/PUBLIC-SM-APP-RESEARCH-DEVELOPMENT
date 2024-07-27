package com.ubicuosoft.devicesservice.model.dto.response.UserActionResponse;

import com.ubicuosoft.devicesservice.model.dto.request.UserActionRequest.User;
import lombok.Data;

@Data
public class UserEvent {
    public User user;
    public UserAction action;
}
