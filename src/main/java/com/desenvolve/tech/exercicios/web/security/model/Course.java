package com.desenvolve.tech.exercicios.web.security.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private String id;
    private String name;
    private String description;
    private List<String> steps;


}
