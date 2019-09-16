package com.example.jsonmappertest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JsonMapped<T> {

    private String name;
    private T value;

    public static JsonMapped<?> from(final String name) {
        if("jsonTest".equals(name)) {
            return new JsonMapped<String>();
        } else if("complexObject".equals(name)) {
            return new JsonMapped<ComplexObject>();
        } else {
            throw new IllegalArgumentException();
        }
    }

}
