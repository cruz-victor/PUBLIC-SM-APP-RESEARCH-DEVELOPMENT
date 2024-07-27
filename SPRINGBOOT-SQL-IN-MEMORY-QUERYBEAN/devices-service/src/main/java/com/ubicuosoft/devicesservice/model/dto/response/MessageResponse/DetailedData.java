package com.ubicuosoft.devicesservice.model.dto.response.MessageResponse;

import com.ubicuosoft.devicesservice.model.dto.response.MessageResponse.deviceMessage.DeviceMessage;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DetailedData {
    private DeviceMessage deviceMessage;
}
