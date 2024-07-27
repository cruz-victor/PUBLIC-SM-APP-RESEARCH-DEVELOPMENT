package com.ubicuosoft.devicesservice.model.dto.response.DeviceDatasheetResponse;

import com.ubicuosoft.devicesservice.model.dto.response.DeviceDatasheetResponse.DatasheetInformation.DatasheetInformation;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Datasheet {
    private Long id;
    private String type;
    private String brand;
    private String model;
    private DatasheetInformation information;
    private String state;
}
