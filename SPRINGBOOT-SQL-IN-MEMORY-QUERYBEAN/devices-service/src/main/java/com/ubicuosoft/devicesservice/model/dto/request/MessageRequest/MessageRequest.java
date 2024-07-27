package com.ubicuosoft.devicesservice.model.dto.request.MessageRequest;

import com.ubicuosoft.devicesservice.model.dto.request.MessageRequest.deviceMessage.ChangeTracking_;
import com.ubicuosoft.devicesservice.model.dto.request.UserActionRequest.UserActionRequest;
import lombok.Data;

@Data
public class MessageRequest {
    private ChangeTracking_ changeTracking;
    private UserActionRequest userAction;
}
