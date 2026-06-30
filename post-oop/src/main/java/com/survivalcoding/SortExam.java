package com.survivalcoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExam {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);

        // 오름차순 정렬
        Collections.sort(numbers);

        System.out.println(numbers);

        List<String> texts = new ArrayList<>();
        texts.add("2");
        texts.add("1");
        texts.add("3");

        // 오름차순 정렬
        Collections.sort(texts);

        System.out.println(texts);
    }
}
