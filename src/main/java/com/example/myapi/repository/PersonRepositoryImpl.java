package com.example.myapi.repository;


import com.example.myapi.entity.Person;

import org.springframework.stereotype.Repository;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

    private Person person;

    @Override
    public void registerPerson(String name) {
        person = new Person(name);
    }

    @Override
    public Person findPerson() {
        if (person != null){
            return person;
        }
        return new Person(null);
    }
}
