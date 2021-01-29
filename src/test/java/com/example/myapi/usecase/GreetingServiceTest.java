package com.example.myapi.usecase;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.example.myapi.exception.LengthLimitException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GreetingServiceTest {
    
    private static GreetingService service;

    @BeforeAll
    public static void setUp() {
        service = new GreetingServiceImpl();
    }

    @Test
    public void case01() {
        String actual = service.responseGreeting("test");
        assertNotNull(actual);
    }

    @Test
    public void case02() {
        String arg = "012345678901234567890123456789";
        Assertions.assertThrows(LengthLimitException.class, () -> {
            service.responseGreeting(arg);
        });
    }

}
