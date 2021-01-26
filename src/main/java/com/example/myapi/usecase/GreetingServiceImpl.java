package com.example.myapi.usecase;

import com.example.myapi.domain.GreetingDomain;
import com.example.myapi.domain.NameDomain;
import com.example.myapi.exception.LengthLimitException;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService {
    
    GreetingDomain greetingLogic = new GreetingDomain();
    NameDomain nameLogic = new NameDomain();

    @Override
    public String responseGreeting(String sentence){
        if(sentence.length() > 20) {
            throw new LengthLimitException();
        }
        String response = greetingLogic.responseGreeting(sentence);
        String name = nameLogic.responseName();
        if (null != name) {
            return response + name + "!";
        } 
        return response;
    }
}
