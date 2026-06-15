package com.survivalcoding;

import java.time.Year;

public class Person {
    private final String name;
    private final int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }
}
