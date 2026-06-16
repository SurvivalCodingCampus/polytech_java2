package com.survivalcoding;

import java.util.*;

public class examCollection {

    Set<String> cities = new HashSet<>(); // 중복 X

    public void setCities() {
        cities.add("서울");
        cities.add("대전");
        cities.add("부산");
    }

    List<Integer> scores = new ArrayList<>();

    public void setScores() {
        scores.add(100);
        scores.add(80);
        scores.add(100);
    }

    Map<String, Integer> cityPopulation = new HashMap<>();

    public void setCityPopulation() {
        cityPopulation.put("서울", 10000000);
        cityPopulation.put("대전", 2000000);
        cityPopulation.put("부산", 4000000);
    }
}
