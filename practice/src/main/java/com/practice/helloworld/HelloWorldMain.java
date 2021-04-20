package com.practice.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//to indicate that this application is Spring Boot application
@SpringBootApplication
public class HelloWorldMain {

    public static void main(String[] args){
//        launch Spring Boot application
        SpringApplication.run(HelloWorldMain.class,args);
    }
}
