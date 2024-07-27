package com.ubicuosoft.devicesservice.model.dto.response.DeviceDatasheetResponse.DatasheetInformation;

import lombok.Data;

import java.util.List;

@Data
public class DatasheetInformation {
    private String title;
    private List<Detail> details;
    private String urlDatasheet;
    private String urlDeviceImage;
}
