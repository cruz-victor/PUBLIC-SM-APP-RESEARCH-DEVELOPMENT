package com.ubicuosoft.devicesservice.model.service.impl;

import com.ubicuosoft.devicesservice.model.common.constants.HttpStatusMessages;
import com.ubicuosoft.devicesservice.model.common.exception.SpecificExceptionHandler;
import com.ubicuosoft.devicesservice.model.entity.message.Message;
import com.ubicuosoft.devicesservice.model.repository.MessageRepository;
import com.ubicuosoft.devicesservice.model.service.MessageCrudService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MessageCrudServiceImpl implements MessageCrudService {
    private final MessageRepository messageRepository;

    @Override
    public Message save(Message message) {
        return this.messageRepository.save(message);
    }

    @Override
    public List<Message> findAll() {
        var messages = this.messageRepository.findAll();
        if (messages.isEmpty()) {
            throw new SpecificExceptionHandler(HttpStatus.NO_CONTENT, HttpStatusMessages.NO_CONTENT);
        }
        return messages;
    }

    @Override
    public Message findById(String uuid) {
        var optionalMessage = this.messageRepository.findById(uuid);
        if (optionalMessage.isEmpty()) {
            throw new SpecificExceptionHandler(HttpStatus.NOT_FOUND, HttpStatusMessages.NOT_FOUND);
        }
        return optionalMessage.get();
    }

    @Override
    public Message update(String uuid,Message message) {
//        message.setUuid(uuid);
//        return this.messageRepository.save(message);
        return null;
    }

    @Override
    public void delete(String uuid) {
        this.messageRepository.deleteById(uuid);
    }
}
