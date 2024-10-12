package com.ubicuosoft.devicesservice.model.dto.projection;

public interface TotalMetersGroupedByStateProjection {
    String getDeviceType();
    Integer getTotal();
    Integer getTotalWorking();
    Integer getTotalOtherStates();
}
