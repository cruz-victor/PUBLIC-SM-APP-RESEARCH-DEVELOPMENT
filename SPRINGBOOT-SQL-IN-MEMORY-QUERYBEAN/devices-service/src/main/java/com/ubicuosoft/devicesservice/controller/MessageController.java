package com.ubicuosoft.devicesservice.controller;

import com.ubicuosoft.devicesservice.model.dto.response.MessageResponse.MessageResponse;
import com.ubicuosoft.devicesservice.model.service.RetriveAllMessagesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devices/api/v2/messages")
@RequiredArgsConstructor
public class MessageController {
    private final RetriveAllMessagesService retriveAllMessagesService;

    @GetMapping
    public MessageResponse findAll() {
        return retriveAllMessagesService.execute();
    }
}