package com.amqp.rabbitMQdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RabbitMQdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMQdemoApplication.class, args);
	}

}
