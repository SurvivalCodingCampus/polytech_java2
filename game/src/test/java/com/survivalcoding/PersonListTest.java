package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PersonListTest {

    @Test
    @DisplayName("PersonList 테스트")
    void PersonList() {
        List<PersonList> personLists = new ArrayList<>();
        personLists.add(new PersonList("홍길동", 20));
        personLists.add(new PersonList("한석봉", 25));

        for (PersonList name : personLists) {
            System.out.println(name.getName() + "의 나이는 " + name.getAge() + "살");
        }
    }

}