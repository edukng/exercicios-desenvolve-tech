package com.desenvolve.tech.exercicios.web.springsecurity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String id;
    private String name;
    private String description;
    private List<Course> courses;
}
