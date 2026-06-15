package com.survivalcoding;

import java.time.LocalDateTime;

public class BirthPerson {
    private final String name;
    private final int birthYear;

    BirthPerson(String name, int birthYear) {
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
        return LocalDateTime.now().getYear() - this.birthYear;
    }
}
