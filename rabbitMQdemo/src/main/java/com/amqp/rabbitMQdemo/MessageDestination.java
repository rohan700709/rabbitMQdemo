package com.amqp.rabbitMQdemo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

//receiver and have to lisen perticular queue
@RabbitListener(queues = "hello")
public class MessageDestination {
    @RabbitHandler//Annotation that marks a method to be the target of a Rabbit message listener within a class that is annotated with RabbitListener.
    public void receive(String in){
        System.out.println("receiverd msg"+in);

    }

}
