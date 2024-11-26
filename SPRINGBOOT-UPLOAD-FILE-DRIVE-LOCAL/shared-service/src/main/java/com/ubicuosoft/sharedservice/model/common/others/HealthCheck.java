package com.ubicuosoft.sharedservice.model.common.others;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class HealthCheck {
    private final WebClient webClient;

    public Mono<Boolean> isServiceUp(String url) {
        return this.webClient.get()
                .uri(url + "/actuator/health")
                .retrieve()
                .bodyToMono(String.class)
                .map(response -> response.contains("\"status\":\"UP\""))
                .onErrorReturn(false);
    }
}
