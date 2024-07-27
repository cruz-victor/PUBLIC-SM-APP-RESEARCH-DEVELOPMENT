package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse.GatewayTraffic;

import lombok.Data;

@Data
public class Daily {
    //Retorna solo el trafico de los ultimos 7 dias
    private Integer year;
    private Integer month;
    private Integer day;
    private Integer uplinks;
    private Integer downlinks;
    private String unit;

}
