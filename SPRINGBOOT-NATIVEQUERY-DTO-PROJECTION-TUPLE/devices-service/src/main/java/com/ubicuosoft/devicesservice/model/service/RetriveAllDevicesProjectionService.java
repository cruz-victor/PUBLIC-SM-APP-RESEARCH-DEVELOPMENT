package com.ubicuosoft.devicesservice.model.service;

import com.ubicuosoft.devicesservice.model.dto.projection.TotalMetersGroupedByStateProjection;
import com.ubicuosoft.devicesservice.model.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class RetriveAllDevicesProjectionService {
    private final DeviceRepository deviceRepository;

    public void execute() {
        System.out.println("RetriveAllDevicesProjectionService.execute");
        Optional<TotalMetersGroupedByStateProjection> result=deviceRepository.getTotalMetersGroupedByStateProjection();
        if (result.isEmpty())
        {
            System.out.println("El resultado de la consulta con Projection esta vacio");
        }

        System.out.println("Datos de la Projection");
        System.out.println(result.get().getDeviceType());
        System.out.println(result.get().getTotal());
        System.out.println(result.get().getTotalOtherStates());
        System.out.println(result.get().getTotalWorking());

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