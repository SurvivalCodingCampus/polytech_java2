package com.survivalcoding;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name;
//    private final int birthYear;

    public Person(String name) {
        this.name = name;
//        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

//    public int getBirthYear() {
//        return birthYear;
//    }
//
//    public int getAge() {
//        int age = LocalDate.now().getYear();
//        return age - this.birthYear;
//    }

    List<Person> people = new ArrayList<>();

    public void setPeople() {
        people.add(new Person("홍길동"));
        people.add(new Person("한석봉"));

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}
