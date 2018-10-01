package com.example.Kafka.producers;

import com.example.Kafka.models.Conversation;
import com.example.Kafka.models.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private KafkaTemplate<String, Greeting> consumeKafkaTemplate;

    @Value(value = "${message.topic.name}")
    private String topicName;

    @Value(value = "${consumable.topic.name}")
    private String consumableTopicName;

    public void sendMessage(String message) {
        kafkaTemplate.send(topicName, message);
    }

    public void sendGreet(Greeting conversation) {
        consumeKafkaTemplate.send(consumableTopicName, conversation);
    }

}
