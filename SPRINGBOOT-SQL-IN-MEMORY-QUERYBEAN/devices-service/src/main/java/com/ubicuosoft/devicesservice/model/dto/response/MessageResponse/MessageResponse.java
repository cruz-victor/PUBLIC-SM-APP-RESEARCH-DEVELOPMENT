package com.ubicuosoft.devicesservice.model.dto.response.MessageResponse;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class MessageResponse {
    private List<MessageRes> messages;
}
