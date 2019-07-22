package com.example.demo;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomFieldsDeserializer extends JsonDeserializer<Map<String, String>> {

    @Override
    public Map<String, String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        TypeReference<List<Map<String, String>>> typeReference = new TypeReference<List<Map<String, String>>>(){};
        List<Map<String, String>> mapList = jsonParser.getCodec().readValue(jsonParser, typeReference);
        Map<String, String> result = new HashMap<>();
        for (Map<String, String> stringStringMap : mapList) {
            result.putAll(stringStringMap);
        }
        return result;
    }
}
