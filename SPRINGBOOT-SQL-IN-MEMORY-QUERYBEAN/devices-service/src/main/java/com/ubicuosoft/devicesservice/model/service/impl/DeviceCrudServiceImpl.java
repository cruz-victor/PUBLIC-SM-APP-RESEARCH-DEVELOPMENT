package com.ubicuosoft.devicesservice.model.service.impl;

import com.ubicuosoft.devicesservice.model.common.constants.HttpStatusMessages;
import com.ubicuosoft.devicesservice.model.common.exception.SpecificExceptionHandler;
import com.ubicuosoft.devicesservice.model.entity.Device;
import com.ubicuosoft.devicesservice.model.repository.DeviceRepository;
import com.ubicuosoft.devicesservice.model.service.DeviceCrudService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DeviceCrudServiceImpl implements DeviceCrudService {
    private final DeviceRepository deviceRepository;

    @Override
    public Device save(Device device) {
        return this.deviceRepository.save(device);
    }

    @Override
    public List<Device> findAll() {
        var devices = this.deviceRepository.findAll();
        if (devices.isEmpty()) {
            throw new SpecificExceptionHandler(HttpStatus.NO_CONTENT, HttpStatusMessages.NO_CONTENT);
        }
        return devices;
    }

    @Override
    public Device findById(Long id) {
        var optionalDevice = this.deviceRepository.findById(id);
        if (optionalDevice.isEmpty()) {
            throw new SpecificExceptionHandler(HttpStatus.NOT_FOUND, HttpStatusMessages.NOT_FOUND);
        }

        return optionalDevice.get();
    }

    @Override
    public Device update(Long id,Device device) {
        device.setId(id);
        return this.deviceRepository.save(device);
    }

    @Override
    public void delete(Long id) {
        this.deviceRepository.deleteById(id);
    }
}
