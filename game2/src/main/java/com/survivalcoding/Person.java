package com.survivalcoding;

public class Person {
    private final int age;
    private String name;
    private int birthYear;

    Person(String name, int birthYear) {
        this.name = name;
        this.age = 2026 - birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public static void main(String[] args) {

        Person person = new Person("Hong", 1998);
        System.out.println(person.name);
        System.out.println(person.age);
    }
}
