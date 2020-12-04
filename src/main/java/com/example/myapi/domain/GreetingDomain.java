package com.example.myapi.domain;

import com.example.myapi.entity.Greeting;

public class GreetingDomain {

    public String responseGreeting(String sentence) {
        String response = "";
        if("hello".equals(sentence)){
            response = Greeting.HELLO;
        } else if ("morning".equals(sentence)){
            response = Greeting.MORNING;
        } else if ("evening".equals(sentence)){
            response = Greeting.EVENING;
        } else {
            response = "Missing your choice...";
        }
        return response;
    }
}