package com.ubicuosoft.devicesservice.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "\"DEVICE\"", schema = "dis")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "type")
    private String type; // type
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "information", nullable = false, columnDefinition = "jsonb")
    private String information;//
    @Column(name = "state")
    private String state; //
    @Column(name = "record_state")
    private String recordState; // "INSERTADO", "BORRADO" getParameters,
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "history", nullable = false, columnDefinition = "jsonb")
    private String history; // llega del action?
    @Column(name = "id_device_datasheet")
    private Long idDeviceDatasheet;//
}
