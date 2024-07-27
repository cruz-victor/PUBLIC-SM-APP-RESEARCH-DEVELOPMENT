package com.ubicuosoft.devicesservice.controller;

import com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.DeviceResponse;
import com.ubicuosoft.devicesservice.model.service.RetriveAllDevicesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devices/api/v2/device")
@RequiredArgsConstructor
public class DeviceController {
    private final RetriveAllDevicesService retriveAllDevicesService;

    @GetMapping
    public DeviceResponse listAllByType(@RequestParam("type-device") String type) {
        return retriveAllDevicesService.execute(type);
    }
}
