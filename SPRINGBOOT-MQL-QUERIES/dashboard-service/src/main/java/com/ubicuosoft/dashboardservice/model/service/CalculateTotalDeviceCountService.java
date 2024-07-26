package com.ubicuosoft.dashboardservice.model.service;

import com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse.TotalDevices;
import org.springframework.stereotype.Service;

@Service
public class CalculateTotalDeviceCountService {
    public TotalDevices execute() {
        //------------------------------------------------------------------------------------------------------------------------
//        3.    calculateTotalDeviceCount()
//                      Obtiene la cantidad total de dispositivos (Medidores y Gateways) registrados en la base de datos. (POSTGRES)

//                      select (select count(*) from dis.DEVICE where type='GATEWAY' and state='ACTIVO') as total,
//                             (select count(*) from dis.DEVICE where type='GATEWAY' and state='ACTIVO' and information.basicInformation.state='EN_LINEA') as totalOnline,
//                             (select count(*) from dis.DEVICE where type='GATEWAY' and state='ACTIVO' and information.basicInformation.state='FUERA_DE_LINEA') as totalOffline

//Total gateways
//    private Integer total;
//    private Integer totalOnline;
//    private Integer totalOffline;

//                      select (select count(*) from dis.DEVICE where type like 'MEDIDOR%' and state='ACTIVO') as total,
//                             (select count(*) from dis.DEVICE where type='GATEWAY' and state='ACTIVO' and information.basicInformation.state='FUNCIONANDO') as totalWorking,
//                             (select count(*) from dis.DEVICE where type='GATEWAY' and stat='ACTIVO' and information.basicInformation.state<>'FUNCIONANDO') as totalOtherStates

//Total medidores
//    private Integer total;
//    private Integer totalWorking;
//    private Integer totalOtherStates;
        throw new UnsupportedOperationException();
    }
}
