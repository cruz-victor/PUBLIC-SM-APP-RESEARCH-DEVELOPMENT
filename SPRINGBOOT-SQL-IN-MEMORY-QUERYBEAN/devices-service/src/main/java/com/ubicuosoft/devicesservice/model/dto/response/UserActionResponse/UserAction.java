package com.ubicuosoft.devicesservice.model.dto.response.UserActionResponse;

import lombok.Data;

import java.util.List;

@Data
public class UserAction {
    public String event;
    public String motive;
    public String timeStamp;
    public List<Modifications> modifications;
}
