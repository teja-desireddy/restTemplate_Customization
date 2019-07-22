package com.example.demo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;
import java.util.Map;

public abstract class PersonMixin {

    @JsonSerialize(using = CustomFieldsSerializer.class)
    @JsonDeserialize(using = CustomFieldsDeserializer.class)
    public List<Map<String,String>> customFields;
}
