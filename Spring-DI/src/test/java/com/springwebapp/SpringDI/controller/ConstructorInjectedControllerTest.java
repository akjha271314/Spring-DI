package com.springwebapp.SpringDI.controller;

import com.springwebapp.SpringDI.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServicesImpl());

    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}