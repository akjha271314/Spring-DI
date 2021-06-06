package com.springwebapp.SpringDI.controller;

import com.springwebapp.SpringDI.services.GreetingServices;

public class PropertyInjectedController {

    public GreetingServices greetingServices;

    public String getGreeting(){

        return greetingServices.sayGreeting();
    }

}
