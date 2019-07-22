package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ExternalPersonController
{

    @GetMapping("/ext/get")
    public ExternalPerson person() {
        ExternalPerson person = new ExternalPerson();
        person.setId(1);
        person.setName("Siva");
        List<Map<String, String>> customFields = new ArrayList<>();
        Map<String, String> customField1 = new HashMap<>();
        customField1.put("fld1", "val1");
        Map<String, String> customField2 = new HashMap<>();
        customField2.put("fld2", "val2");
        customFields.add(customField1);
        customFields.add(customField2);
        person.setCustomFields(customFields);
        System.out.println("Get response from External :"+person);
        return person;
    }

    @PostMapping("/ext/post")
    public ExternalPerson save(@RequestBody ExternalPerson person) {
        System.out.println("Post response from External :"+person);
        return person;
    }

}
