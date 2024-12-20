package com.ubicuosoft.devicesservice.model.repository;

import com.ubicuosoft.devicesservice.model.dto.PaylaodProjection;
import com.ubicuosoft.devicesservice.model.dto.PayloadWrapper;
import com.ubicuosoft.devicesservice.model.entity.message.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MessageRepository extends MongoRepository<Message, String> {
    List<Message> findByUuid(String uuid);
    List<Message> findAll();
    List<Message> findByMessageEvent(String event);
    List<Message> findByMessageChangeTrackingActionUserEmail(String email);
    List<Message> findByDeviceCode(String code);
    List<Message> findByDeviceCodeAndMessageType(String code, String type);
    List<Message> findByMessageChangeTrackingReviewState(String state);
    List<Message> findByMessageChangeTrackingReviewDate(String date);
    List<Message> findByDeviceCodeAndMessageTypeAndMessageChangeTrackingActionUserEmail(String code, String type, String email);
    PaylaodProjection findPayloadByUuid(String uuid);

    @Query("{ 'message.changeTracking.actionUser.email': ?0 }")
    List<Message> findByMessageChangeTrackingActionUserEmailExact(String email);
    @Query("{ 'payload.decode.key':'VALVULA', 'payload.decode.value':'ABIERTA'}")
    List<Message> findByPayloadDecodeKeyAndValue();
    @Query(" { 'device.code': ?0, 'message.type': ?1, 'message.changeTracking.actionUser.email': ?2 }")
    List<Message> findByDeviceCodeAndMessageTypeAndMessageChangeTrackingActionUserEmailWhitQuery(String code, String type, String email);
    @Query(value = "{'uuid': ?0}", fields = "{'payload':1, '_id':0}")
    PaylaodProjection findByUuidGetPayload(String uuid);
    @Query(value="{ 'uuid' : ?0 }", fields = "{'payload':1, '_id':0}")
    //Spring Data, no sabe como mapear directamente a una subclase del documento, en su lugar intenta recuperar todo el documento
    //Las soluciones son usar: Projection o Wrapper
    PayloadWrapper findByUuidGetPayloadObject(String uuid);
}
