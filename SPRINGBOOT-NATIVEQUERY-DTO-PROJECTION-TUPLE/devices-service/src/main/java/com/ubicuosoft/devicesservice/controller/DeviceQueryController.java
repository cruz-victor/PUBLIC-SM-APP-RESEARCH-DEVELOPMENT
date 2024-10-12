package com.ubicuosoft.devicesservice.controller;

import com.ubicuosoft.devicesservice.model.service.RetriveAllDevicesProjectionService;
import com.ubicuosoft.devicesservice.model.service.RetriveAllDevicesProjectionWithClassService;
import com.ubicuosoft.devicesservice.model.service.RetriveAllDevicesWithDtoService;
import com.ubicuosoft.devicesservice.model.service.RetriveAllDevicesWithTupleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devices/api/v2/device/query")
@RequiredArgsConstructor
public class DeviceQueryController {
    private final RetriveAllDevicesProjectionService retriveAllDevicesProjectionService;
    private final RetriveAllDevicesProjectionWithClassService retriveAllDevicesProjectionWithClassService;
    private final RetriveAllDevicesWithDtoService retriveAllDevicesDtoService;
    private final RetriveAllDevicesWithTupleService retriveAllDevicesWithTupleService;

    @GetMapping("/projection")
    public String listAllDevicesProjection() {
        retriveAllDevicesProjectionService.execute();
        return "";
    }

    @GetMapping("/projection-class")
    public String listAllDevicesProjectionWithClass() {
        retriveAllDevicesProjectionWithClassService.execute();
        return "";
    }

    @GetMapping("/dto")
    public String listAllDevicesDto() {
        retriveAllDevicesDtoService.execute();
        return "";
    }

    @GetMapping("/tuple")
    public String listAllDevicesTuple() {
        retriveAllDevicesWithTupleService.execute();
        return "";
    }
}
