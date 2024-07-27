package com.ubicuosoft.devicesservice.model.entity.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Review {
    private String date;
    private String state;
    private String observation;
}
