package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private int id;
    private String name;
    private Map<String, String> customFields;
}
