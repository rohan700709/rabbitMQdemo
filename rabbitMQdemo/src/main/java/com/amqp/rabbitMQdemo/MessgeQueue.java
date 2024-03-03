package com.amqp.rabbitMQdemo;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("hello-world")
public class MessgeQueue {
    //// need all objects automaticatlly load in mem so need to use @Bean and
    // we are creating factory method to return object
    //create object of messaging Queue

    @Bean
    public Queue getQueue(){
        return new Queue("hello");
    }
    //need one object of sender
    @Bean
    @Profile("sender")
    public MessageSource getSender(){
        return new MessageSource();
    }
    // one object of receiver
    @Bean
    @Profile("receiver")
    public MessageDestination getReceiver(){
        return new MessageDestination();
    }




}
