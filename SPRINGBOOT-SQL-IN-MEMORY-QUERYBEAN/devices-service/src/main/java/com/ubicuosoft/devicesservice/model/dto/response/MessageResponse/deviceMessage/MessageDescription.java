
package com.ubicuosoft.devicesservice.model.dto.response.MessageResponse.deviceMessage;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class MessageDescription {
    private String type;
    private String event;
    private String period;
    private String messageColor;
    private List<ChangeTrackingResponse> changeTrackings;

}
