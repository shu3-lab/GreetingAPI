package com.example.myapi.usecase;

import com.example.myapi.domain.GreetingDomain;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService {
    
    GreetingDomain greetingLogic = new GreetingDomain();

    @Override
    public String responseGreeting(String sentence){
        String response = greetingLogic.responseGreeting(sentence);
        return response;
    }
}
