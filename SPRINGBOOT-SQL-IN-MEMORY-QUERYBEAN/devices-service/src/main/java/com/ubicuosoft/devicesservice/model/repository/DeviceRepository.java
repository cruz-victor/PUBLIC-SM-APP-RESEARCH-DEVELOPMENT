package com.ubicuosoft.devicesservice.model.repository;

import com.ubicuosoft.devicesservice.model.dto.DeviceDto;
import com.ubicuosoft.devicesservice.model.dto.DeviceGroupByTypeProjection;
import com.ubicuosoft.devicesservice.model.dto.DeviceProjection;
import com.ubicuosoft.devicesservice.model.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {
    List<Device> findByType(String typeDevice);
    List<Device> findByTypeAndStateAndRecordState(String typeDevice, String state, String recordState);
    List<DeviceProjection> findDistinctByType(String typeDevice);
    List<DeviceDto> findDistinctByTypeAndState(String typeDevice, String state);
    List<Device> findFirstByType(String typeDevice);
    List<Device> findTop4ByType(String typeDevice);
    @Query("SELECT device.type as typeDevice, count(device) as totalDevices " +
            "FROM Device device " +
            "WHERE device.type=:typeDevice " +
            "GROUP BY device.type")
    List<DeviceGroupByTypeProjection> findCountByType(String typeDevice);
}