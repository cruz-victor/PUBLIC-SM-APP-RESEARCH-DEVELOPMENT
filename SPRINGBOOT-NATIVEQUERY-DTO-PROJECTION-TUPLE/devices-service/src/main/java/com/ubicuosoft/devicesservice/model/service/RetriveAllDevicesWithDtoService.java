package com.ubicuosoft.devicesservice.model.service;

import com.ubicuosoft.devicesservice.model.dto.DeviceDto;
import com.ubicuosoft.devicesservice.model.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class RetriveAllDevicesWithDtoService {
    private final DeviceRepository deviceRepository;

    public void execute() {
        System.out.println("RetriveAllDevicesWithDtoService.execute");
        Object[] resultObject=deviceRepository.getTotalMetersGroupedByStateDto();

        System.out.println("Mostrar datos del Dto ="+ Arrays.toString(resultObject));
        System.out.println("Recupera los valoes del vector Object[]");

//        DeviceDto deviceDto=new DeviceDto();
//        deviceDto.setId(Long.parseLong(resultObject[0].toString()));
//        deviceDto.setType(resultObject[1].toString());
//        deviceDto.setInformation(resultObject[2].toString());
//        deviceDto.setState(resultObject[3].toString());
//        deviceDto.setRecordState(resultObject[4].toString());
//        deviceDto.setHistory(resultObject[5].toString());
//        deviceDto.setIdDeviceDatasheet(Long.parseLong(resultObject[6].toString()));
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