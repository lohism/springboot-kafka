package com.lohis.springkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringkafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringkafkaApplication.class, args);
	}

}
