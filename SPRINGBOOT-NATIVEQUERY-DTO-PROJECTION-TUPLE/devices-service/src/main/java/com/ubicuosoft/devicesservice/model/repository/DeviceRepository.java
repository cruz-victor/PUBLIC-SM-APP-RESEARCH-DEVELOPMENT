package com.ubicuosoft.devicesservice.model.repository;

import com.ubicuosoft.devicesservice.model.dto.DeviceDto;
import com.ubicuosoft.devicesservice.model.dto.projection.TotalMetersGroupedByStateProjection;
import com.ubicuosoft.devicesservice.model.entity.Device;
import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {
    @Query(value="SELECT " +
            "device.type AS deviceType, " +
            "COUNT(*) AS total, " +
            "COUNT(*) FILTER (WHERE information->'basicInformation'->>'state' = 'FUNCIONANDO') AS totalWorking, " +
            "COUNT(*) FILTER (WHERE information->'basicInformation'->>'state' <> 'FUNCIONANDO') AS totalOtherStates " +
            "FROM dis.\"DEVICE\" device " +
            "WHERE device.type LIKE 'MEDIDOR_%' AND device.state = 'ACTIVO' " +
            "GROUP BY device.type "+
            "LIMIT 1", nativeQuery = true)
    Optional<TotalMetersGroupedByStateProjection> getTotalMetersGroupedByStateProjection();

    //JPQL NATIVE QUERY NO FUNCION CON DTO, SE NECESITAN CONFIGURACIONES ADICIONALES
//    @Query(value="SELECT device.* FROM dis.\"DEVICE\" device LIMIT 1", nativeQuery = true)
//    Optional<DeviceDto> getTotalMetersGroupedByStateDto();
//    @Query(value="SELECT * FROM dis.\"DEVICE\" device LIMIT 1", nativeQuery = true)
//    Object[] getTotalMetersGroupedByStateDto();
    @Query(value="SELECT device.id , device.type , device.information , device.state , device.record_state , device.history , device.id_device_datasheet FROM dis.\"DEVICE\" device LIMIT 1", nativeQuery = true)
    Object[] getTotalMetersGroupedByStateDto();


    //JPQL NATIVE QUERY NO FUNCIONA CON JSONB
//    @Query("SELECT new com.ubicuosoft.devicesservice.model.dto.TotalMetersGroupedByStateDto(" +
//            "d.type, " +
//            "COUNT(d), " +
//            "SUM(CASE WHEN d.information.basicInformation.state = 'FUNCIONANDO' THEN 1 ELSE 0 END), " +
//            "SUM(CASE WHEN d.information.basicInformation.state = 'FUNCIONANDO' THEN 1 ELSE 0 END)) " +
//            "FROM Device d " +
//            "WHERE d.type LIKE 'MEDIDOR_%' AND d.state = 'ACTIVO' " +
//            "GROUP BY d.type")
//    Optional<TotalMetersGroupedByStateDto> findTotalMetersGroupedByStateJPQL();

    @Query(value="SELECT " +
            "device.type AS deviceType, " +
            "COUNT(*) AS total, " +
            "COUNT(*) FILTER (WHERE information->'basicInformation'->>'state' = 'FUNCIONANDO') AS totalWorking, " +
            "COUNT(*) FILTER (WHERE information->'basicInformation'->>'state' <> 'FUNCIONANDO') AS totalOtherStates " +
            "FROM dis.\"DEVICE\" device " +
            "WHERE device.type LIKE 'MEDIDOR_%' AND device.state = 'ACTIVO' " +
            "GROUP BY device.type "+
            "LIMIT 1", nativeQuery = true)
    Optional<Tuple> getTotalMetersGroupedByStateTuple();
}