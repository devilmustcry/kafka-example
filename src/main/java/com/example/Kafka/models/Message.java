package com.example.Kafka.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Message extends Conversation {

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        System.out.println("ToString" + message);
        return message;
    }
}
