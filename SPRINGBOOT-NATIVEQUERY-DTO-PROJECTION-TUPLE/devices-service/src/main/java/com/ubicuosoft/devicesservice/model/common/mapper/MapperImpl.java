package com.ubicuosoft.devicesservice.model.common.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MapperImpl implements Mapper {
    private final ModelMapper modelMapper;

    public MapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public <T> T map(Object source, Class<T> destinationType) {
        return modelMapper.map(source, destinationType);
    }

    @Override
    public void map(Object source, Object destinationType) {
        modelMapper.map(source, destinationType);
    }

    @Override
    public <T> List<T> mapList(List<?> sourceList, Class<T> destinationType) {
        return sourceList.stream()
                .map(source -> modelMapper.map(source, destinationType))
                .collect(Collectors.toList());
    }
}