package com.ubicuosoft.devicesservice.model.service;

import com.ubicuosoft.devicesservice.model.entity.Device;

import java.util.List;

public interface DeviceCrudService {
    Device save(Device device);
    List<Device> findAll();
    Device findById(Long id);
    Device update(Long id, Device device);
    void delete(Long id);
}
