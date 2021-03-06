package com.springwebapp.SpringDI.controller;

import com.springwebapp.SpringDI.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingServices(new GreetingServicesImpl());
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());

    }
}