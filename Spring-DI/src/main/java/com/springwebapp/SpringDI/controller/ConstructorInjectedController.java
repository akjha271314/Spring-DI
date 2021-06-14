package com.springwebapp.SpringDI.controller;

import com.springwebapp.SpringDI.services.GreetingServices;

public class ConstructorInjectedController {

    private final GreetingServices greetingServices;

    public ConstructorInjectedController(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting(){

        return greetingServices.sayGreeting();
    }
}
