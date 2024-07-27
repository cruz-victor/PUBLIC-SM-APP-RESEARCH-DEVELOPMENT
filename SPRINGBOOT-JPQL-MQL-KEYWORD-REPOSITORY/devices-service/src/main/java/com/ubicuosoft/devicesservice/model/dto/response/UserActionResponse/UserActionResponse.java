package com.ubicuosoft.devicesservice.model.dto.response.UserActionResponse;

import lombok.Data;

import java.util.List;

@Data
public class UserActionResponse {
    public int recordId;
    public List<UserEvent> events;
}
