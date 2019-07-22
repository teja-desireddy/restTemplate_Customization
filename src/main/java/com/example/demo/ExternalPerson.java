package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalPerson {
    private int id;
    private String name;
    private List<Map<String, String>> customFields;
}