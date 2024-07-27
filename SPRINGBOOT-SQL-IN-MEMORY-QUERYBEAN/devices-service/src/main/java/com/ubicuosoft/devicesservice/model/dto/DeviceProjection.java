package com.ubicuosoft.devicesservice.model.dto;


public interface DeviceProjection {
    String getType();
    String getInformation();
    String getState();
    String getRecordState();
    String getHistory();
    Long getIdDeviceDatasheet();
}
