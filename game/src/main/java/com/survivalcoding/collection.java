package com.survivalcoding;

import java.util.*;

public class collection {
    public static void main(String[] args) {
        //다음 정보를 저장하기 좋은 컬렉션을 List, Set, Map 중 고르시오.그 이유는?
//
//    대한민국의 도시 이름 모음 (순서 상관 없음)
//    set 빠르게 출력
        Set<String> city = new HashSet<>();
        city.add("Suwon");
        city.add("Seoul");
        city.add("Busan");
//    10명 학생의 시험 점수
//    list 순위 순서 대로 저장
        ArrayList<Integer> score = new ArrayList<>();
        score.add(100);
        score.add(50);
        score.add(30);
//    대한민국의 도시별 인구수 (순서 상관 없음)
//    map 도시 이름과 인구수 저장
        Map<String, Integer> cities = new HashMap<>();
        cities.put("서울", 977);
        cities.put("수원", 977);
        cities.put("부산", 344);

    }
}
