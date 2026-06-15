package com.survivalcoding;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final int birthYear;

    public Person(String name, int brithYear) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("이름은 필수 입력 항목입니다.");
        }
        this.name = name;
        this.birthYear = brithYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        LocalDate currentLocalDate = LocalDate.now();
        int currentYear = currentLocalDate.getYear();

        return currentYear - this.birthYear;
    }
}
