package com.ubicuosoft.dashboardservice.model.service;

import com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse.LastReading;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FetchRecentDeviceReadingsService {
    public List<LastReading> execute() {
        //------------------------------------------------------------------------------------------------------------------------
//        8.    retrieveRecentDeviceReadings()
//                      Obtiene las ultimas N lecturas almacenados en base de datos. (MONGODB)

//                      select device.id as idDevice, device.code as codeDevice, uuid, timestamp as date, payload.decode(x).value as consumption, payload.decode(x).unit as units
//                      from message_collection_mongodb
//                      where message.event='LEER_LECTURA_CONSUMO_MEDIDOR' and message.payload.decode(x).key='LECTURA'

//    private Integer idDevice;
//    private String codeDevice;
//    private String uuid;
//    private String date;
//    private String consumption;
//    private String units;
        throw new UnsupportedOperationException();
    }
}
