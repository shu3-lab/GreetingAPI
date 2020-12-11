package com.example.myapi.controller;

import com.example.myapi.usecase.NameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("name")
public class NameController {
    
    @Autowired
    private NameService service;

    @RequestMapping(method = RequestMethod.POST)
    public void rememberName(@RequestParam(name = "name", required = false) String name){
        service.rememberName(name);;
    }
}
