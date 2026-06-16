package com.survivalcoding;

import java.util.LinkedHashMap;
import java.util.Map;

public class Person {
    private final String name;
    private final int age;
//    private final int birthYear;

    public Person(String name, int age) {
        this.name = name;
//        this.birthYear = birthYear;
        this.age = age;
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
    public int getAge() {
        return age;
    }

    Map<String, Integer> people = new LinkedHashMap<>();

    public void setPeople() {
        Person person1 = new Person("홍길동", 20);
        Person person2 = new Person("한석봉", 25);

        people.put(person1.getName(), person1.getAge());
        people.put(person2.getName(), person2.getAge());

        for (String name : people.keySet()) {
            System.out.println(name + "의 나이는 " + people.get(name) + "살");
        }
    }
}
