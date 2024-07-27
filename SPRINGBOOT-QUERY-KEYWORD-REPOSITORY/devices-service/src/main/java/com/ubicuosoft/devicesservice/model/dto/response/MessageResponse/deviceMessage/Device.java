
package com.ubicuosoft.devicesservice.model.dto.response.MessageResponse.deviceMessage;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Device {
    private Long id;
    private String code;
    private String type;

}
