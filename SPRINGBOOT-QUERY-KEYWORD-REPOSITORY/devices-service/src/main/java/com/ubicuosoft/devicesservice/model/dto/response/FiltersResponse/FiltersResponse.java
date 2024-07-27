package com.ubicuosoft.devicesservice.model.dto.response.FiltersResponse;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class FiltersResponse {
    private Map<String, List<FilterFields>> filters;
}
