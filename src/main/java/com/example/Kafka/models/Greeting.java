package com.example.Kafka.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Greeting extends Conversation {

    private String msg;
    private String name;

    public Greeting(String msg, String name) {
        super();
        this.msg = msg;
        this.name = name;
    }
    @Override
    public String toString() {
        return this.msg + " : " + this.name;
    }


    @Override
    public String getMessage() {
        return this.msg + ", " + this.name;
    }
}
