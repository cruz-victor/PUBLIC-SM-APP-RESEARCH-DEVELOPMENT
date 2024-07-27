package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.MeterDeviceResponse;

import lombok.Data;

@Data
public class MeterLocation {
    private Boolean isAvailable;
    private Long id;
    private String type;
    private String address;
    private String district;
    private String street;
    private String addressNumber;
    private String reference;
    private Double height;
    private Double latitude;
    private Double longitude;
    private String urlImageMap;
    private String state;
}