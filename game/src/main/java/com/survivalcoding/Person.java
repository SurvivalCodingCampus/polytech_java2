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
        names.add("홍길동");
        names.add("한석봉");

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }

        //컬렉션 2
        List<Person> people = new ArrayList<>();
        people.add(new Person("홍길동", 20));
        people.add(new Person("한석봉", 25));

        for (Person person : people) {
            System.out.println(person.getName() + "의 나이는 " + person.getAge() + "살");
        }
    }

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }


}