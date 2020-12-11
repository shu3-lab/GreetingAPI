package com.example.myapi.usecase;

import com.example.myapi.domain.NameDomain;

import org.springframework.stereotype.Component;

@Component
public class NameServiceImpl implements NameService {
    
    NameDomain nameLogic = new NameDomain();

    @Override
    public void rememberName(String name) {
        nameLogic.rememberName(name);
    }
}
