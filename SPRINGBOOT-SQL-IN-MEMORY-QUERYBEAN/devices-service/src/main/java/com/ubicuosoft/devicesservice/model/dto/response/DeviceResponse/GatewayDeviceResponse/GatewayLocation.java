package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse;

import lombok.Data;

@Data
public class GatewayLocation {
    private Boolean isAvailable; //Calculado. En caso de existir la ubicacion del dispositivo = true caso contrario false
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