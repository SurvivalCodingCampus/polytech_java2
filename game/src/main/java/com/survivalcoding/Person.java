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

    public Person(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Person은 반드시 유효한 이름을 포함해야 합니다.");
        }
        this.name = name;
        this.birthYear = 0;
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
    //List에 담긴 모든 Person 인스턴스의 이름을 표시하는 코드는 Main클래스에 있다
}


