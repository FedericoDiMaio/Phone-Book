package com.example.PhoneBook.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Document(collection = "Contact")
public class Contact {

    @Id
    private String id;
    private String name;
    private String surName;
    private String number;


    public String getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public String getSurName() {

        return surName;
    }

    public String getNumber() {

        return number;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSurName(String surName) {

        this.surName = surName;
    }

    public void setNumber(String number) {

        this.number = number;
    }

    public void setId(String id) {
        this.id = id;
    }
}
