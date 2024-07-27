package com.ubicuosoft.devicesservice.model.common.mapper;

public interface JacksonMapper {
     <T> String toJson(T object);
     <T> T toObject(String jsonString, Class<T> targetClass);
}
