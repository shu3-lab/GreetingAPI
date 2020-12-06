package com.example.myapi.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GreetingDomainTest {
    
    private static GreetingDomain domain;

    @BeforeAll
    public static void setUp() {
        domain = new GreetingDomain();
    }

    @Test
    public void caseHello(){
        String actual = domain.responseGreeting("hello");
        String expected = "Hello, everyone!";
        assertEquals(expected, actual);
    }

    @Test
    public void caseMorning(){
        String actual = domain.responseGreeting("morning");
        String expected = "Good morning, everyone!";
        assertEquals(expected, actual);
    }

    @Test
    public void caseEvening(){
        String actual = domain.responseGreeting("evening");
        String expected = "Good evening, everyone!";
        assertEquals(expected, actual);
    }

    @Test
    public void caseNumber(){
        String actual = domain.responseGreeting("1");
        String expected = "Missing your choice...";
        assertEquals(expected, actual);
    }

    @Test
    public void caseBrank(){
        String actual = domain.responseGreeting("");
        String expected = "Missing your choice...";
        assertEquals(expected, actual);
    }

    @Test
    public void caseSpace(){
        String actual = domain.responseGreeting(" ");
        String expected = "Missing your choice...";
        assertEquals(expected, actual);
    }
}
