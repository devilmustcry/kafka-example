package com.example.Kafka.consumers;

import com.example.Kafka.models.Greeting;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {


    @KafkaListener(topics = "${message.topic.name}", groupId = "foo", containerFactory = "kafkaListenerContainerFactory")
    public void listenGroupFoo(String message) {
        System.out.println("Received Messasge in group 'foo': " + message);
    }

    @KafkaListener(topics = "${consumable.topic.name}", groupId = "conversation", containerFactory = "conversationKafkaListenerContainerFactory")
    public void listenGroupConsume(Greeting conversation) {
        System.out.println("Received conversation message: " + conversation.getMessage());
    }

}
