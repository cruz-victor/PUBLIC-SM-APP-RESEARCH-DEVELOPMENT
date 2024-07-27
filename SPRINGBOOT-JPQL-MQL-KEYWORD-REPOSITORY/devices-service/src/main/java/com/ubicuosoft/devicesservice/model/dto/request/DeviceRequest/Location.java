package com.ubicuosoft.devicesservice.model.dto.request.DeviceRequest;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Location {
    //Consumir el endpoint: POST /locations del servicio: location-service para guardar la informacion del Ubicacion del medidor
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