package com.practice.datajpa.entity;

import javax.persistence.*;

//tell JPA this is a concrete class( the class render with table)
@Entity
//which table to render
//defaults -> user (lower case class name
@Table(name = "tbl_user")
public class User {

//    primary key
    @Id
//    self increasing
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "last_name", length = 50)
    private String lastName;
//    defaults -> attribute name is column name
    @Column
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
