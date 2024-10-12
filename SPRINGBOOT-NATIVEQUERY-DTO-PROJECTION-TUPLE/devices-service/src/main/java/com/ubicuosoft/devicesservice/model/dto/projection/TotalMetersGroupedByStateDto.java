package com.ubicuosoft.devicesservice.model.dto.projection;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TotalMetersGroupedByStateDto implements TotalMetersGroupedByStateProjection {
    private String deviceType;
    private Integer total;
    private Integer totalWorking;
    private Integer totalOtherStates;
}
