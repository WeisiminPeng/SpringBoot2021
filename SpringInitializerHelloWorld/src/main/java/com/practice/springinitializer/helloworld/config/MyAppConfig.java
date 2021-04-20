package com.practice.springinitializer.helloworld.config;


import com.practice.springinitializer.helloworld.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//indicate that this class is a configuration class
//using to substitute Spring configuration file(.xml) beans.xml before
//in the .xml file, we use <bean><bean/> tag to add component
@Configuration
public class MyAppConfig {

//    add the reply value to container
//    the id in .xml file in container is the method name
    @Bean
    public HelloWorldService helloService(){
        System.out.println("MyAppConfig class add component into container");
        return new HelloWorldService();
    }
}
