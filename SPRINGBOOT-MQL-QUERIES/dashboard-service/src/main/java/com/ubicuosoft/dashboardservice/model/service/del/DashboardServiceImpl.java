package com.ubicuosoft.dashboardservice.model.service.del;

import com.ubicuosoft.dashboardservice.model.common.client.device.IDeviceClient;
import com.ubicuosoft.dashboardservice.model.common.client.serviceStatuses.IServiceStatuses;
import com.ubicuosoft.dashboardservice.model.common.client.sharedService.ISharedServiceClient;
import com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse.DashboardResponse;
import com.ubicuosoft.dashboardservice.model.service.del.client.DeviceCount;
import com.ubicuosoft.dashboardservice.model.service.del.client.TimestampResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private ISharedServiceClient sharedServiceClient;

    @Autowired
    private IServiceStatuses serviceStatuses;

    @Autowired
    private IDeviceClient deviceClient;

    @Override
    public DashboardResponse getDashboardInformation() {
//        1.    retrieveSystemDateTime()
//        2.    fetchCurrentSystemStatus()
//        3.    calculateTotalDeviceCount()
//        4.    determineDeviceStateCounts()
//        5.    collectDeviceGeographicalCoordinates()
//        6.    compareConsumptionLastTwoYears()
//        7.    retrieveRecentDeviceAlerts()
//        8.    retrieveRecentDeviceReadings()
//        9.    buildDashboardResponse()
        return null;
    }

    private LocalDateTime retrieveSystemDateTime() {
        TimestampResponse timestampResponse = sharedServiceClient.getTimestamp();
        return LocalDateTime.parse(timestampResponse.getTimestamp());
    }

    public boolean fetchCurrentSystemStatus() {
        return serviceStatuses.getServiceStatuses();
    }

    public DeviceCount calculateTotalDeviceCount() {
        return deviceClient.getDeviceCount();
    }

    public Object determinateDeviceStateCounts() {
        return deviceClient.getActiveDevices();
    }

//------------------------------------------------------------------------------------------------------------------------
//        1.    retrieveSystemDateTime()
//                      Obtiene la fecha y hora actual del sisteam.
//                      Consumir el endpoint: /timestamp del servicio shared-service


//------------------------------------------------------------------------------------------------------------------------
//        2.    fetchCurrentSystemStatus()
//                      Verificiar que todos los servicios esten funcionado correctamente (spring boot actuator)
//                          dashboard-service: http://localhost:9091/actuator/health
//                          accounts-service: http://localhost:8085/actuator/health
//                          devices-service: http://localhost:8093/actuator/health
//                          help-center-service: http://localhost:9096/actuator/health
//                          location-service: http://localhost:9093/actuator/health
//                          report-service: http://localhost:9095/actuator/health
//                          setting-service: http://localhost:8082/actuator/health
//                          shared-service: http://localhost:9098/actuator/health
//                      Si todos los servicios del sistema estan funcionando retornar un valor boleano true


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


//------------------------------------------------------------------------------------------------------------------------
//        6.    compareConsumptionLastTwoYears()
//                      Obtiene la compracion del consumo de agua/electricidad/gas de cada mediddor de los dos ultimos años. (MONGODB)

//                      select year(timestamp) as year, getYearColor(timestamp) as yearColor, sum(payload.decode(x).value) month_consuption as
//                      from message_collection_mongodb
//                      where message.event='LEER_LECTURA_CONSUMO_MEDIDOR' and message.payload.decode(x).key='LECTURA'

//    private Integer year;
//    private String yearColor;
//    private List<Integer> month;


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


//------------------------------------------------------------------------------------------------------------------------
//        9.    buildDashboardResponse()
//                      Construye el objeto de respuesta del endpoint. (MONGODB)
}