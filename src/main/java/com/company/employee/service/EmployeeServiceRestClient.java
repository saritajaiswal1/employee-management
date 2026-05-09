package com.company.employee.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeServiceRestClient {

    private final RestTemplate restTemplate;

    public EmployeeServiceRestClient(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    public String getEmployees(){
        String url="http://localhost:8081/employees";
        return restTemplate.getForObject(url,String.class);
    }
}
