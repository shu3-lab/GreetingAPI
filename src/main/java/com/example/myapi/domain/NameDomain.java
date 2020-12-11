package com.example.myapi.domain;

import com.example.myapi.entity.Person;
import com.example.myapi.repository.PersonRepository;
import com.example.myapi.repository.PersonRepositoryImpl;

public class NameDomain {
    
    private PersonRepository repo = new PersonRepositoryImpl();

    public void rememberName(String name) {
        repo.registerPerson(name);
    }

    public String responseName() {
        Person person = repo.findPerson();
        return person.getName();
    }
}
