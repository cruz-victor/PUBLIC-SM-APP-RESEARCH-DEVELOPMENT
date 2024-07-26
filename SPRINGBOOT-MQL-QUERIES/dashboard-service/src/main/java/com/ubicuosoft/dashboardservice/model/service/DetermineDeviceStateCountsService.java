package com.ubicuosoft.dashboardservice.model.service;

import com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse.TotalDevicesStates;
import org.springframework.stereotype.Service;

@Service
public class DetermineDeviceStateCountsService {
    public TotalDevicesStates execute() {
        //------------------------------------------------------------------------------------------------------------------------
//        4.    determineDeviceStateCounts()
//                      Obtiene la cantidad total de estados (Activo, Inactivo, etc) de dispositivos (Medidores y Gateways) registrados en la base de datos. (POSTGRES)

//                      Agrupar por state
//                      select information.basicInformation.state, count(*), getMeterStateColor(information.basicInformation.state)
//                      from dis.DEVICE
//                      where state='ACTIVO'
//                      group by information.basicInformation.state

//    private String state;
//    private Integer totalDevices;
//    private String stateColor;
        throw new UnsupportedOperationException();
    }
}
