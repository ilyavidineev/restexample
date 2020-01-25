package ru.iamvidineev.restexample.model;

import lombok.Data;

@Data
public class Client {
    private Integer id;
    private String name;
    private String email;
    private String phone;
}

