package com.amqp.rabbitMQdemo;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;


//sender/producer/publisher.source
public class MessageSource {

    @Autowired
    private RabbitTemplate rabbitTemplate;//predefined class
    @Autowired
    private Queue queue; //import org.springframework.amqp.core.Queue; not from util

    //create sender method which execute continously
    //@Scheduled to continiously execute method
    // initialDelay = 500 first time it waits for half sec
    //fixedDelay = 1000 after every execution it wait for 1 sec
    @Scheduled(fixedDelay = 1000,initialDelay = 500)
    public void send(){
        System.out.println("sent messgage: ");
        String message="hello";
        //rabbittemplate gives msg in binary so need to convert
        rabbitTemplate.convertAndSend(queue.getName(),message);
        System.out.println("sent messgage: "+message);
    }
}
