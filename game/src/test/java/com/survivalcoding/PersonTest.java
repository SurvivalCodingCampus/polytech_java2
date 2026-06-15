package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    @DisplayName("get naem, get birthYear, getAge")
    void PersonTest_() {
        //준비
        String name = "홍길동";
        int by = 2000;
        int age;
        //실행
        Person person = new Person(name, by);
        age = person.getAge();
        //검증
        assertEquals(name, person.getName());
        assertEquals(by, person.getBirthYear());
        assertEquals(age, person.getAge());
    }
}