package com.ubicuosoft.devicesservice.model.service;

import com.ubicuosoft.devicesservice.model.dto.PaylaodProjection;
import com.ubicuosoft.devicesservice.model.dto.PayloadWrapper;
import com.ubicuosoft.devicesservice.model.dto.response.MessageResponse.MessageResponse;
import com.ubicuosoft.devicesservice.model.entity.message.Message;
import com.ubicuosoft.devicesservice.model.entity.message.Payload;
import com.ubicuosoft.devicesservice.model.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RetriveAllMessagesService {
    private final MessageRepository messageRepository;
    public MessageResponse execute() {
        System.out.println("------------------MONGODB-----------------");
        System.out.println("------------------findByUuid-----------------");
        List<Message> messages=messageRepository.findByUuid("454fsd4fs5sf212fds45fsd5f02");
        messages.forEach(message -> {
            System.out.println(message);
        });

        System.out.println("------------------findAll-----------------");
        List<Message> messages2=messageRepository.findAll();
        messages2.forEach(message -> {
            System.out.println(message);
        });

        System.out.println("------------------findByMessageEvent-----------------");
        List<Message> messages3=messageRepository.findByMessageEvent("ABRIR_VALVULA_MEDIDOR");
        messages3.forEach(message -> {
            System.out.println(message);
        });

        System.out.println("------------------findByMessageChangeTrackingActionUserEmail-----------------");
        List<Message> messages4=messageRepository.findByMessageChangeTrackingActionUserEmail("vic@gmail.com");
        messages4.forEach(message -> {
            System.out.println(message);
        });

        System.out.println("------------------findByMessageChangeTrackingActionUserEmailExact-----------------");
        List<Message> messages5=messageRepository.findByMessageChangeTrackingActionUserEmailExact("vic@gmail.com");
        messages5.forEach(message -> {
            System.out.println(message);
        });

        System.out.println("11------------------findByDeviceCode-----------------");
        List<Message> messages11=messageRepository.findByDeviceCode("MEDA-0000001");
        messages11.forEach(message -> {
            System.out.println(message);
        });

        System.out.println("22------------------findByDeviceCodeAndMessageType-----------------");
        List<Message> messages22=messageRepository.findByDeviceCodeAndMessageType("MEDA-0000001", "UPLINK");
        messages22.forEach(message -> {
            System.out.println(message);
        });

        System.out.println("33------------------findByMessageChangeTrackingReviewState-----------------");
        List<Message> messages33=messageRepository.findByMessageChangeTrackingReviewState("PENDIENTE");
        messages33.forEach(message -> {
            System.out.println(message);
        });

        System.out.println("44------------------findByMessageChangeTrackingReviewDate-----------------");
        List<Message> messages44=messageRepository.findByMessageChangeTrackingReviewDate("2023-01-15 15:01:10");
        messages44.forEach(message -> {
            System.out.println(message);
        });

        System.out.println("55------------------findByDeviceCodeAndMessageTypeAndMessageChangeTrackingActionUserEmail-----------------");
        List<Message> messages55=messageRepository.findByDeviceCodeAndMessageTypeAndMessageChangeTrackingActionUserEmail("MEDA-0000001","UPLINK","vic@gmail.com");
        messages55.forEach(message -> {
            System.out.println(message);
        });

        System.out.println("66------------------findByPayloadDecodeKeyAndValue-----------------");
        List<Message> messages66=messageRepository.findByPayloadDecodeKeyAndValue();
        messages66.forEach(message -> {
            System.out.println(message);
        });

        System.out.println("77------------------findByDeviceCodeAndMessageTypeAndMessageChangeTrackingActionUserEmailWhitQuery-----------------");
        List<Message> messages77=messageRepository.findByDeviceCodeAndMessageTypeAndMessageChangeTrackingActionUserEmailWhitQuery("MEDA-0000001", "UPLINK", "vic@gmail.com");
        messages77.forEach(message -> {
            System.out.println(message);
        });

        System.out.println("88------------------findByUuidGetPayload-----------------");
        PaylaodProjection messages88=messageRepository.findByUuidGetPayload("454fsd4fs5sf212fds45fsd5f02");
        System.out.println(messages88);
        System.out.println(messages88.getPayload());

        System.out.println("99------------------findByUuidGetPayloadObject-----------------");
        PayloadWrapper messages99=messageRepository.findByUuidGetPayloadObject("454fsd4fs5sf212fds45fsd5f02");
        System.out.println(messages99);
        System.out.println(messages99.getPayload().getDecode());

        System.out.println("10------------------findPayloadByUuid projection-----------------");
        PaylaodProjection  messages10=messageRepository.findPayloadByUuid("454fsd4fs5sf212fds45fsd5f02");
        System.out.println(messages10);
        System.out.println(messages10.getPayload());

        return null;
    }
}
