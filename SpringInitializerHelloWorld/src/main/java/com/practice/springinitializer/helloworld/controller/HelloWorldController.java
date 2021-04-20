package com.practice.springinitializer.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//**************************************
//if put @ResponseBody here
//it means all the methods in this class will directly response to the web page on browser
//it the message is an object, it will automatically transfer it to JSON format and response to web page
//@ResponseBody
//**************************************
//@Controller
//**************************************
//@RestController = @ResponseBody + @Controller
@RestController
public class HelloWorldController {

//    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World from Spring Initializer!";
    }

    @Value("${person.name}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello " + name;
    }
}
