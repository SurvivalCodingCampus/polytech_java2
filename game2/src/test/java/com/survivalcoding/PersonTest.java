package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PersonTest {

    @Test
    @DisplayName("이름과 나이가 제대로 나와야 한다")
    void test() {
        String test = "홍길동"; //이름
        int test2 = 1998; // 태어난 날짜
        int test3 = 2026; // 올해 날짜

        //Given
        Person person = new Person(test, test2);

        //when
        person.setName(test);
        person.setBirthYear(test2);
        //Then
        assertEquals(test, person.getName());
        assertEquals(test3 - test2, person.age);
    }


}