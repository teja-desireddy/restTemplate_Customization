package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PersonController
{

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getme")
    public Person getPerson() {
        ResponseEntity<Person> responseEntity = restTemplate.getForEntity("http://localhost:8080/ext/get", Person.class);
        System.out.println("Get Response on Client Side :"+responseEntity.getBody());
        return responseEntity.getBody();
    }

    @PostMapping("/postme")
    public Person save(@RequestBody Person person) {
        ResponseEntity<Person> responseEntity = restTemplate.postForEntity("http://localhost:8080/ext/post", person, Person.class);
        System.out.println("Post Response on Client Side :"+responseEntity.getBody());
        return responseEntity.getBody();
    }
}
