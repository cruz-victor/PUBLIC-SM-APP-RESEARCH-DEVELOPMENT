package com.ubicuosoft.dashboardservice.model.service;

import org.springframework.stereotype.Service;

@Service
public class FetchCurrentSystemStatusService {
    public Boolean execute() {
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
        throw new UnsupportedOperationException();
    }
}
