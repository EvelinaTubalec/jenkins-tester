package com.example.jenkinstester;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String id = UUID.randomUUID().toString();

    private String name;

    public User(String name) {
        this.name = name;
    }
}
