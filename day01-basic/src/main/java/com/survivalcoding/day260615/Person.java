package com.survivalcoding.day260615;
import java.time.LocalDate;

//1. 대한민국의 도시 이름 모음
//Set<String>
//
//2. 10명 학생의 시험 점수
//List<Integer>
//
//3. 대한민국의 도시별 인구수
//Map<String, Integer>

public class Person {
    private String name;
    private int birthYear;
    private int age;


    public Person(String name) {
        setName(name);
    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name == null || name.length() < 2) {
            throw new IllegalArgumentException("사람의 이름은 null일 수 없고 2문자 이상이어야 합니다.");
        }
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int myAge){
        if (myAge < 0) {
            throw new IllegalArgumentException("나이는 0살 이상이여야 합니다");
        }
        this.age = myAge;
        this.birthYear = LocalDate.now().getYear() - age;
    }

    public int getBirthYear(){
        return birthYear;
    }
}

