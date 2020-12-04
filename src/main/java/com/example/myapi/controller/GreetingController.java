package com.example.myapi.controller;

import com.example.myapi.usecase.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greeting")
public class GreetingController {
    
    @Autowired
    private GreetingService service;

    @RequestMapping(method = RequestMethod.GET)
    public String responseGreeting(@RequestParam(name = "sentence", required = false) String sentence){
        String response = service.responseGreeting(sentence);
        return response;
    }

}
