package com.ubicuosoft.devicesservice.model.repository;

import com.ubicuosoft.devicesservice.model.entity.message.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String> {

}
