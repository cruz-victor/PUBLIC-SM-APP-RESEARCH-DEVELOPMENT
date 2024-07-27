package com.ubicuosoft.devicesservice.model.common.constants;

import java.util.List;

public class DeviceTypeUtils {

    public static final List<String> MeterList = List.of(
            "MEDIDOR_ELECTRICIDAD",
            "MEDIDOR_GAS",
            "MEDIDOR_AGUA",
            "MEDIDOR_ELECTRICIDAD"
    );
    public static final String GATEWAY = "GATEWAY";

    public static boolean deviceTypeIsMeter(String deviceType) {
        return MeterList.contains(deviceType);
    }
}
