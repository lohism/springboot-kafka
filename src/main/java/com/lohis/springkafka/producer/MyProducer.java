package com.lohis.springkafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MyProducer implements CommandLineRunner {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    private static final String MY_TOPIC = "my-topic";

    private int messageCount = 0 ;
    @Override
    public void run(String... args) throws Exception {

        kafkaTemplate.send(MY_TOPIC, "my-message-" + messageCount++);
        System.out.println(messageCount + "messages produced");
    }
}
