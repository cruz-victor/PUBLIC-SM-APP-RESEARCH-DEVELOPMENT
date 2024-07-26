package com.ubicuosoft.dashboardservice.model.common.client.device;

import com.ubicuosoft.dashboardservice.model.service.del.client.DeviceCount;

    public interface IDeviceClient {
    DeviceCount getDeviceCount();
        Object getActiveDevices();
}
