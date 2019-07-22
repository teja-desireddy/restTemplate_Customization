package com.example.demo;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomFieldsSerializer extends JsonSerializer<Map<String,String>> {

    @Override
    public void serialize(Map<String, String> maps, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        List<Map<String, String>> customFields = new ArrayList<>();
        for (String value : maps.values()) {
            Map<String, String> map = new HashMap<>();
            map.put(value, value);
            customFields.add(map);
        }
        jsonGenerator.writeObject(customFields);
    }
}
