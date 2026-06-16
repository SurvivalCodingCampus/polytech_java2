package com.survivalcoding;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Person2 {
    public static void main(String[] args) {
        Person2 person = new Person2();
        Person2 person1 = new Person2();
        ArrayList<String> names = new ArrayList<String>();
        names.add("홍길동");
        names.add("한석봉");

        for (String name : names) {
            System.out.println(name);
        }

        Map<String, Integer> people = new LinkedHashMap<>();

        people.put("홍길동", 20);
        people.put("한석봉", 25);

        for (String key : people.keySet()) {
            int value = people.get(key);
            System.out.println(key + "의 나이는" + value + "살");
        }
    }
}
