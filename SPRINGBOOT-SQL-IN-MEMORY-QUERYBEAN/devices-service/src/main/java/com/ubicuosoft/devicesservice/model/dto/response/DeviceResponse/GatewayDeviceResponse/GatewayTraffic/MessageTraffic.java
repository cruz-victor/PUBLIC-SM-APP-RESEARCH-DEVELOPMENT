package com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.GatewayDeviceResponse.GatewayTraffic;

import lombok.Data;

import java.util.List;

@Data
public class MessageTraffic {

    private List<Daily> daily;

}
