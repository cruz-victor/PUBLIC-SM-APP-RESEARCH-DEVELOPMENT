package com.ubicuosoft.devicesservice.model.service;

import com.ubicuosoft.devicesservice.model.dto.DeviceDto;
import com.ubicuosoft.devicesservice.model.dto.DeviceGroupByTypeProjection;
import com.ubicuosoft.devicesservice.model.dto.DeviceProjection;
import com.ubicuosoft.devicesservice.model.dto.response.DeviceResponse.DeviceResponse;
import com.ubicuosoft.devicesservice.model.entity.Device;
import com.ubicuosoft.devicesservice.model.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RetriveAllDevicesService {
    private final DeviceRepository deviceRepository;

    public DeviceResponse execute(String type) {
        System.out.println("-----------------findByType");
        List<Device> devices=deviceRepository.findByType("MEDIDOR_GAS");
        System.out.println(devices.size());
        System.out.println(devices);

        System.out.println("-----------------findByTypeAndStateAndRecordState");
        List<Device> devices2=deviceRepository.findByTypeAndStateAndRecordState("MEDIDOR_GAS", "ACTIVO", "INSERTADO");
        System.out.println(devices2.size());
        System.out.println(devices2);

        System.out.println("-----------------findDistinctByType");
        List<DeviceProjection> devices3=deviceRepository.findDistinctByType("MEDIDOR_GAS");
        System.out.println(devices3.size());
        System.out.println(devices3);
        devices3.forEach(device->{
            System.out.println(device.getType());
            System.out.println(device.getInformation());
            System.out.println(device.getState());
            System.out.println(device.getRecordState());
            System.out.println(device.getHistory());
            System.out.println(device.getIdDeviceDatasheet());
        });

        System.out.println("-----------------findDistinctByTypeAndState");
        List<DeviceDto> devices4=deviceRepository.findDistinctByTypeAndState("MEDIDOR_GAS", "INACTIVO");
        System.out.println(devices4.size());
        System.out.println(devices4);
        devices4.forEach(device->{
            System.out.println(device.getType());
            System.out.println(device.getInformation());
            System.out.println(device.getState());
            System.out.println(device.getRecordState());
            System.out.println(device.getHistory());
            System.out.println(device.getIdDeviceDatasheet());
        });

        System.out.println("-----------------findCountByType");
        List<DeviceGroupByTypeProjection> devices5=deviceRepository.findCountByType("MEDIDOR_GAS");
        System.out.println(devices5.size());
        System.out.println(devices5);
        devices5.forEach(device->{
            System.out.println(device.getTypeDevice());
            System.out.println(device.getTotalDevices());
        });

        System.out.println("-----------------findFirstByType");
        List<Device> devices6=deviceRepository.findFirstByType("MEDIDOR_GAS");
        System.out.println(devices6.size());
        System.out.println(devices6);
        devices6.forEach(device->{
            System.out.println(device.getId());
            System.out.println(device.getType());
        });

        System.out.println("-----------------findTop4ByType");
        List<Device> devices7=deviceRepository.findTop4ByType("MEDIDOR_GAS");
        System.out.println(devices7.size());
        System.out.println(devices7);
        devices7.forEach(device->{
            System.out.println(device.getId());
            System.out.println(device.getType());
        });

        return null;
    }

/*
    https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html

    COMPARACIONES BASICAS
    findBy: Encuentra todas las entidades que coincidan con una condición.
    findFirstBy: Encuentra la primera entidad que coincida con una condición.
    findTop3By: Encuentra las primeras 3 entidades que coincidan con una condición.

    OPERADORES DE COMPARACION
    findByAgeLessThan(int age): Encuentra entidades donde la edad sea menor a age.
    findByAgeGreaterThan(int age): Encuentra entidades donde la edad sea mayor a age.
    findByAgeBetween(int startAge, int endAge): Encuentra entidades donde la edad esté entre startAge y endAge.
    findByAgeIsNull(): Encuentra entidades donde la edad es null.
    findByAgeIsNotNull(): Encuentra entidades donde la edad no es null.

    OPERADORES LOGICOS
    findByLastNameAndFirstName(String lastName, String firstName): Encuentra entidades donde el apellido y el nombre coincidan.
    findByLastNameOrFirstName(String lastName, String firstName): Encuentra entidades donde el apellido o el nombre coincidan.

    CONDICIONES DE TEXTO
    findByLastNameLike(String lastName): Encuentra entidades donde el apellido coincida parcialmente (LIKE en SQL).
    findByLastNameNotLike(String lastName): Encuentra entidades donde el apellido no coincida parcialmente.
    findByLastNameStartingWith(String prefix): Encuentra entidades donde el apellido empiece con un prefijo.
    findByLastNameEndingWith(String suffix): Encuentra entidades donde el apellido termine con un sufijo.
    findByLastNameContaining(String infix): Encuentra entidades donde el apellido contenga una subcadena.

    CONDICIONES DE COLECCION
    findByRolesContains(Role role): Encuentra entidades donde la colección de roles contenga un rol específico.
    findByRolesIsEmpty(): Encuentra entidades donde la colección de roles esté vacía.
    findByRolesIsNotEmpty(): Encuentra entidades donde la colección de roles no esté vacía.

    ORDENAMIENTO
    findByLastNameOrderByFirstNameAsc(String lastName): Encuentra entidades donde el apellido coincida y ordena los resultados por nombre en orden ascendente.
    findByLastNameOrderByFirstNameDesc(String lastName): Encuentra entidades donde el apellido coincida y ordena los resultados por nombre en orden descendente.

    LIMITACION DE RESULTADOS
    findTop3ByOrderByLastNameAsc(): Encuentra las primeras 3 entidades ordenadas por apellido en orden ascendente.
    findFirst5ByOrderByLastNameDesc(): Encuentra las primeras 5 entidades ordenadas por apellido en orden descendente.
*/

}