package com.example.Kafka.services;

import com.example.Kafka.consumers.KafkaConsumer;
import com.example.Kafka.models.Conversation;
import com.example.Kafka.models.Greeting;
import com.example.Kafka.producers.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

//    @Value(value = "${consumable.topic.name}")
//    private String consumableTopicName;
    @Autowired
    public KafkaProducer kafkaProducer;

    @Autowired
    public KafkaConsumer kafkaConsumer;


    public void greet(Greeting greet) {
        kafkaProducer.sendGreet(greet);
    }




}
