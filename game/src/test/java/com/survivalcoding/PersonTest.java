package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    @DisplayName("Name")
    void getNameBirthYear() {
//        Person person = new Person("테스트");

//        assertEquals("테스트", person.getName());
//        assertEquals(2000, person.getBirthYear());
    }

    @Test
    @DisplayName("Age")
    void getAge() {
//        Person person = new Person("테스트");

//        int birthYear = person.getBirthYear();
//        int year = LocalDate.now().getYear();
//        int age = year - birthYear;
//        assertEquals(age, person.getAge());
    }


    @Test
    @DisplayName("Person Name")
    void getName() {
//        Person person = new Person("홍길동");
//
//        assertEquals("홍길동", person.getName());
    }

    @Test
    @DisplayName("List에 홍길동과 한석봉을 담는다")
    void setPeople() {
//        Person person = new Person("테스트용");
//
//        person.setPeople();
//
//        assertEquals(2, person.people.size());
//        assertEquals("홍길동", person.people.get(0).getName());
//        assertEquals("한석봉", person.people.get(1).getName());
        Person person = new Person("홍길동", 20);

        assertEquals("홍길동", person.getName());
        assertEquals(20, person.getAge());
    }


    @Test
    @DisplayName("Map에 이름과 나이를 저장")
    void setPeopleAge() {
        Person person = new Person("테스트용", 0);

        person.setPeople();

        assertEquals(2, person.people.size());
        assertEquals(20, person.people.get("홍길동"));
        assertEquals(25, person.people.get("한석봉"));
    }
}