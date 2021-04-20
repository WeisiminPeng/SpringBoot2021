package com.practice.springinitializer.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class HelloworldApplication {

    public static void main(String[] args) {

        SpringApplication.run(HelloworldApplication.class, args);
    }

}
