package com.example.jsonmappertest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ComplexObject {

    private String value;
    private String name;
    private int number;
    private int measure;

}
