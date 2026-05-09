package com.company.employee.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class EmployeeServiceWebClient {
    private final WebClient webClient;

    public EmployeeServiceWebClient(WebClient webClient){
        this.webClient=webClient;
    }

    public String getEmployees(){
        return webClient.get()
                .uri("http://localhost:8081/employees")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
