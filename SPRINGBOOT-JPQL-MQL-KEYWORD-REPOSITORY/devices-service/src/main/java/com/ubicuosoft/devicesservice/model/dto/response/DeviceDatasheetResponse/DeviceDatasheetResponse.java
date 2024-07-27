package com.ubicuosoft.devicesservice.model.dto.response.DeviceDatasheetResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class DeviceDatasheetResponse {
    private Datasheet datasheet;
}
