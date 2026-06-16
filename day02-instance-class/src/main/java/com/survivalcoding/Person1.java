package com.survivalcoding;

import java.util.HashMap;
import java.util.Map;


public class Person1 {
    private final String name;

    public Person1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }

    /* public static void main(String[] args) {
        List<Person1> people = new ArrayList<>();

        people.add(new Person1("홍길동"));
        people.add(new Person1("한석봉"));

        for (Person1 person : people) {
            System.out.println(person.getName());
        }
    }
    */

    public static void main(String[] args) {
        Person1 hong = new Person1("홍길동");
        Person1 han = new Person1("한석봉");

        Map<Person1, Integer> ageMap = new HashMap<>();

        ageMap.put(hong, 20);
        ageMap.put(han, 25);

        for (Person1 person : ageMap.keySet()) {
            System.out.println(person.getName() + "의 나이는 " + ageMap.get(person) + "살");

        }
    }
}
