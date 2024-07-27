package com.ubicuosoft.devicesservice.model.common.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class JacksonMapperImpl implements JacksonMapper {
    private final ObjectMapper objectMapper;

    @Override
    public <T> String toJson(T object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException();//TODO: excepcion
        }
    }

    @Override
    public <T> T toObject(String jsonString, Class<T> targetClass) {
        try {
            return objectMapper.readValue(jsonString, targetClass);
        } catch (Exception e) {
            throw new RuntimeException();//TODO: excepcion
        }
    }
}
