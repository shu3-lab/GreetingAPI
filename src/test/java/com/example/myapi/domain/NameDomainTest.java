package com.example.myapi.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NameDomainTest {

    private static NameDomain domain;
    
    @BeforeAll
    public static void setUp() {
        domain = new NameDomain();
        domain.rememberName("test");
    }

    @Test
    public void caseName() {
        String actual = domain.responseName();
        String expected = "test";
        assertEquals(expected, actual);
    }
    
}
