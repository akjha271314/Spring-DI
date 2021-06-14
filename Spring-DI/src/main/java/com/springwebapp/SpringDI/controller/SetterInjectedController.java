package com.springwebapp.SpringDI.controller;

import com.springwebapp.SpringDI.services.GreetingServices;

public class SetterInjectedController {

    private GreetingServices greetingServices;

    public void setGreetingServices(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting(){

        return greetingServices.sayGreeting();
    }
}
