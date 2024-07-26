package com.ubicuosoft.dashboardservice.model.service;

import com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse.LastAlert;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FetchRecentDeviceAlertsService {
    public List<LastAlert> execute() {
        //------------------------------------------------------------------------------------------------------------------------
//        7.    retrieveRecentDeviceAlerts()
//                      Obtiene las ultimas N alertas almacenados en base de datos. (MONGODB)

//                      select uuid, device.type as type, timestamp as date, getAlertColor(message.payload.decode(x).key) as alertColor
//                      from message_collection_mongodb
//                      where message.event='ALERTAS_EVENTOS_MEDIDOR'

//    private String uuid;
//    private String type;
//    private String date;
//    private String alertColor;
        throw new UnsupportedOperationException();
    }
}
