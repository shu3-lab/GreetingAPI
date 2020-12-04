package com.example.myapi.domain;

public class GreetingDomain {

    private static final String HELLO = "Hello, everyone!";
    private static final String MORNING = "Good morning, everyone!";
    private static final String EVENING = "Good evening, everyone!";

    public String responseGreeting(String sentence) {
        String response = "";
        if("hello".equals(sentence)){
            response = HELLO;
        } else if ("morning".equals(sentence)){
            response = MORNING;
        } else if ("evening".equals(sentence)){
            response = EVENING;
        } else {
            response = "Missing your choice...";
        }
        return response;
    }
}