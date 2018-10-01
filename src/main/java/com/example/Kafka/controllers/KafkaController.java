package com.example.Kafka.controllers;

import com.example.Kafka.models.Greeting;
import com.example.Kafka.services.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    public KafkaService kafkaService;

//    @PostMapping("/say")
//    public String sendMessage(@Valid @RequestBody Message message) {
//        kafkaService.sendMessage(message.getMessage());
//        return "Success";
//    }

    @PostMapping("/greeting")
    public String greet (@Valid @RequestBody Greeting greet) {
        kafkaService.greet(greet);
        return "Success";
    }


}
