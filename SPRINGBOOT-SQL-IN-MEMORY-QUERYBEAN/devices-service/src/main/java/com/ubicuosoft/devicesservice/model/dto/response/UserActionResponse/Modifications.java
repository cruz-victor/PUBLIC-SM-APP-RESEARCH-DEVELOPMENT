package com.ubicuosoft.devicesservice.model.dto.response.UserActionResponse;

import lombok.Data;

@Data
public class Modifications {
    public String field;
    public String current;
    public String previous;
}
