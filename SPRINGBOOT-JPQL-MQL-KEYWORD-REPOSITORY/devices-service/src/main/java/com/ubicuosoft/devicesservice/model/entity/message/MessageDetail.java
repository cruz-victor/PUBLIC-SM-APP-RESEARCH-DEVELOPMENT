package com.ubicuosoft.devicesservice.model.entity.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MessageDetail {
    private String type;
    private String event;
    private String period;
    private String unit;
    private String messageColor;
    private List<ChangeTracking> changeTracking;
}
