package com.ubicuosoft.sharedservice;

import com.ubicuosoft.sharedservice.model.common.others.HealthCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceStartupCheckerConfig {
    @Autowired
    private HealthCheck healthCheck;

    @Bean
    public ApplicationRunner checkServices() {
        return args -> {
//            Mono<Boolean> locationService = healthCheck.isServiceUp(Services.LOCATION_SERVICE);
//            Mono<Boolean> sharedService = healthCheck.isServiceUp(Services.SHARED_SERVICE);
//
//            Mono.zip(locationService, sharedService)
//                    .doOnNext(tuple -> {
//                        if (!tuple.getT1() || !tuple.getT2()) {
//                            throw new RuntimeException("One or more services are down!");
//                        }
//                    })
//                    .block();  // Bloquea hasta que se completen las verificaciones
        };
    }
}
