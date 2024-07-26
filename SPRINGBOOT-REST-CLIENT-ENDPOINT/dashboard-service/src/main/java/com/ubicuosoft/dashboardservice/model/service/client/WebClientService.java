package com.ubicuosoft.dashboardservice.model.service.client;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static org.springframework.http.HttpMethod.*;

@RequiredArgsConstructor
@Service
public class WebClientService {
    private final WebClient webClient;

    public <T> T execute(String endpoint, HttpMethod method, String port, Object requestBody, Class<T> responseType) {
        validateWebClientParameters(endpoint, method, port, requestBody, responseType);
        Mono<T> responseMono = invokeEndpoint(endpoint, method, requestBody, responseType);
        return builWebClientResponse(responseMono);
    }

    private <T> T builWebClientResponse(Mono<T> responseMono) {
        try{
            return responseMono.block();
        }catch (Exception e){
            throw new RuntimeException();
        }
    }

    private <T> void validateWebClientParameters(String endpoint, HttpMethod method, String port, Object requestBody, Class<T> responseType) {
        if (endpoint == null || endpoint.isEmpty()) {
            throw new IllegalArgumentException("Endpoint must not be null or empty");
        }
        if (method == null) {
            throw new IllegalArgumentException("HTTP method must not be null");
        }

        if (port == null) {
            throw new IllegalArgumentException("HTTP method must not be null");
        }

        if (requestBody ==null){
            throw new IllegalArgumentException("HTTP method must not be null");
        }

        if (responseType == null) {
            throw new IllegalArgumentException("Response type must not be null");
        }
    }


    private <T> Mono<T> invokeEndpoint(String endpoint, HttpMethod method, Object requestBody, Class<T> responseType) {
        try{
            if (GET.equals(method)) {
                return webClient.get()
                        .uri(endpoint)
                        .retrieve()
                        .bodyToMono(responseType);
            }

            if (POST.equals(method)) {
                return webClient.post()
                        .uri(endpoint)
                        .bodyValue(requestBody)
                        .retrieve()
                        .bodyToMono(responseType);

            }

            if (PUT.equals(method)) {
                return webClient.put()
                        .uri(endpoint)
                        .bodyValue(requestBody)
                        .retrieve()
                        .bodyToMono(responseType);
            }

            if (DELETE.equals(method)) {
                return webClient.delete()
                        .uri(endpoint)
                        .retrieve()
                        .bodyToMono(responseType);
            } else {
                throw new IllegalArgumentException("Unsupported HTTP method: " + method);
            }
        }
        catch (Exception e){
            throw new RuntimeException();
        }
    }
}
