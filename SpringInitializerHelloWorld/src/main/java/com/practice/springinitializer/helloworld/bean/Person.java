package com.practice.springinitializer.helloworld.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

//tell Spring Boot all the attributes in this class are connected with configuration file
//prefix to tell Spring Boot the values are under which key

//get properties from global configuration file
@ConfigurationProperties(prefix = "person")
//@Validated

@PropertySource(value = {"classpath:person.properties"})
@Component
public class Person {

//    @Value("${person.name}")
//    validate name to email format
//    @Email
    private String name;
//    @Value("#{11*2}")
    private int age;
//    @Value("true")
    private boolean type;
    private Date birth;

//    @Value("${person.maps}")
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
