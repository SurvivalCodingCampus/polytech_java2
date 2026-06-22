package com.survivalcoding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("HONGGILDONG");
        names.add("HANSUKBONG");

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }

        //컬렉션 2
        List<Person> people = new ArrayList<>();
        people.add(new Person("HONGGILDONG", 20));
        people.add(new Person("HANSUKBONG", 25));

        for (Person person : people) {
            System.out.println(person.getName() + "'s age is " + person.getAge() + "years old");
        }
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }


}