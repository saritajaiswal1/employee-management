package com.company.employee.service;

public interface SQSMessageService {
    void processMessage(String message);
}
