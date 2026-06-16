package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class Person2Test {

    @Test
    @DisplayName("이름이 제대로 나와야 한다.")
    void main() {
        String test = "홍길동";
        String test2 = "한석봉";
        //Given
        ArrayList<String> names = new ArrayList<String>();
        //When
        names.add(test);
        names.add(test2);
        //Then
        assertIterableEquals(List.of(test, test2), names);

    }

    @Test
    @DisplayName("이름과 나이가 제대로 나와야 한다")
    void test() {
        String test = "홍길동";
        String test2 = "한석봉";
        int test3 = 20;
        int test4 = 25;

        //Given
        Map<String, Integer> people = new LinkedHashMap<>();
        //When
        people.put(test, test3);
        people.put(test2, test4);
        //Then
        assertEquals(Map.of(test, test3, test2, test4), people);

    }
}