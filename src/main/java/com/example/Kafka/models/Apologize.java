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
public class Apologize extends Conversation {

    private String msg;

    @Override
    public String getMessage() {
        return msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}
