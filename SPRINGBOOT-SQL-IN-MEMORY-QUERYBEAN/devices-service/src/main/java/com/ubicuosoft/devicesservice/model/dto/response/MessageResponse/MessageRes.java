package com.ubicuosoft.devicesservice.model.dto.response.MessageResponse;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MessageRes {
    private String uuidMessage; //message_mongodb.uuid
    private GeneralData generalData;
    private DetailedData detailedData;
}
