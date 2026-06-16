package com.survivalcoding;

import java.time.Year; // 올해 연도를 구하기 위해 자바 시계 기능을 가져옴

//캡슐화
public class Person {
    private final String name;
    private final int birthYear;

    //태어난 년도, 이름을 Constructor(생성자)로 받기 위해 최초 초기화 및 선언
    //이 구간은 scanf와 같은 역할
    //⭐TEST파일에서 new로 할당할때 사용될 함수(메소드)
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - this.birthYear;
    }
}