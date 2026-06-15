package com.survivalcoding;

public class PersonList {
    /* 연습문제1
    1) Set: 중복되는 도시 이름을 제외하기 위해서
    2) Map: 키와 값이 쌍으로 이루어진 요소이며, 키의 중복은 허용되지 않기 때문에
    3) Map: 도시 이름이 중복되지 않기 때문에
     */

    private final String name;
    private final int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public PersonList(String name, int age) {
        this.name = name;
        this.age = age;
    }


}