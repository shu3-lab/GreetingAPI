package com.example.myapi.usecase;

import com.example.myapi.domain.GreetingDomain;
import com.example.myapi.domain.NameDomain;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService {
    
    GreetingDomain greetingLogic = new GreetingDomain();
    NameDomain nameLogic = new NameDomain();

    @Override
    public String responseGreeting(String sentence){
        String response = greetingLogic.responseGreeting(sentence);
        String name = nameLogic.responseName();
        if (null != name) {
            return response + name + "!";
        } 
        return response;
    }
}
