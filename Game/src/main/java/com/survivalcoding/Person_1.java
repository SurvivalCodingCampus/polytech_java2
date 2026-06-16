package com.survivalcoding;

import java.time.Year;

// public을 지우고 그냥 class Person으로 작성
class Person_1 {
    private final String name;
    private final int birthYear;

    public Person_1(String name, int birthYear) {
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
        int currentYear = Year.now().getValue();
        return currentYear - this.birthYear;
    }
}