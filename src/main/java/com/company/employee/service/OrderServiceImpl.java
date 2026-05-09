package com.company.employee.service;

import org.springframework.stereotype.Service;
import io.awspring.cloud.sqs.annotation.SqsListener;

@Service
public class OrderServiceImpl implements SQSMessageService {

    @Override
   // @SqsListener("employee-queue")
    public void processMessage(String message) {
      System.out.println("Received message: "+message);

      //process message
        processOrder(message);

        System.out.println("Message processed successfully");
    }

    private void processOrder(String message){

        //Business logic
        System.out.println("Processing order: "+message);
    }
}
