package com.ubicuosoft.dashboardservice.model.service;

import com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse.DeviceCoordinates;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FetchDeviceCoordinatesService {
    public List<DeviceCoordinates> execute() {
        //------------------------------------------------------------------------------------------------------------------------
//        5.    collectDeviceGeographicalCoordinates()
//                      Obtiene las coordenadas geograficas de cada dispositivos (Medidores y Gateways) (POSTGRES)

//                      select latitude, longitude, heigh, id_device
//                      from map.LOCATION
//                      where state='ACTIVO'

//    private Double latitude;
//    private Double longtude;
//    private Double height;
//    private Device device;
        throw new UnsupportedOperationException();
    }
}
