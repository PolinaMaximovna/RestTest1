package ru.java.courses.resttest.persons;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person {
    private final long id;
    private final String name;
}
