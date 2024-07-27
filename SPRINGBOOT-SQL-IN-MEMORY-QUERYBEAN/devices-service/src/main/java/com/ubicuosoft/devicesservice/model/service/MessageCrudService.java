package com.ubicuosoft.devicesservice.model.service;

import com.ubicuosoft.devicesservice.model.entity.message.Message;

import java.util.List;

public interface MessageCrudService {
    Message save(Message message);
    List<Message> findAll();
    Message findById(String uuid);
    Message update(String uuid, Message message);
    void delete(String uuid);
}
