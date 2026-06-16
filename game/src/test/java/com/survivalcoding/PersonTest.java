package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void Person() {
        Person person = new Person("홍홍홍", 2005);

        String actualName = person.getName();
        int actualBirthYEar = person.getBirthYear();

        int actualAge = person.getAge();

        assertEquals("홍홍홍", actualName);
        assertEquals(2005, actualBirthYEar);
        assertEquals(21, actualAge);
    }
}