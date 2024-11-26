package com.ubicuosoft.sharedservice.model.common.mapper;

import java.util.List;

public interface Mapper {
        <T> T map(Object source, Class<T> destinationType);

        void map(Object source, Object destinationType);

        <T> List<T> mapList(List<?> sourceList, Class<T> destinationType);
}
