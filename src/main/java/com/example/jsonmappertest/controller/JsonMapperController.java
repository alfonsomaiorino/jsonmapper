package com.example.jsonmappertest.controller;

import com.example.jsonmappertest.model.TestObject;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class JsonMapperController {

    @GetMapping("/jsonMapped")
    public List<TestObject> returnJsonMapped() {
        RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8085/json";

        ResponseEntity<List<TestObject>> result = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<TestObject>>() {});
        List<TestObject> list = result.getBody();
        return list;
    }

}
