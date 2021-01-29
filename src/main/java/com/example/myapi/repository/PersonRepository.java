package com.example.myapi.repository;

import com.example.myapi.entity.Person;

public interface PersonRepository {
    public void registerPerson(String name);
    public Person findPerson();
}
