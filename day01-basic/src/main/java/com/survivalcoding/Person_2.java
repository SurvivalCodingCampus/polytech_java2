package com.survivalcoding;

import java.util.HashMap;
import java.util.Map;

class Person_2 {
/*    연습문제 1
    다음 정보를 저장하기 좋은 컬렉션을 List, Set, Map 중 고르시오. 그 이유는?
    1) 대한민국의 도시 이름 모음 (순서 상관 없음)
        정답 : Set
        이유) Set은 순서가 상관없기 때문이다. 그리고 내부적으로 데이터를
              확인하는 속도가 빨라 정보를 찾기 유용하다.

    2) 10명 학생의 시험 점수
        정답 : List
        이유 : 시험 점수는 똑같은 점수를 맞는 학생들도 있기 때문에 똑같은
              데이터를 허용하는 List를 사용해야한다.

    3) 대한민국 도시별 인구수 (순서 상관 없음)
        정답 : Map
        이유 : 도시 이름(Key)과 인구수(Value)를 같이 저장해야하기 때문이다.*/

    private final String name;

    public Person_2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

/*class Person2 {
    public static void main(String[] args) {
        List<Person_2> personList = new ArrayList<>();

        personList.add(new Person_2("홍길동"));
        personList.add(new Person_2("한석봉"));

        for (Person_2 person2 : personList) {
            System.out.println(person2.getName());
        }
    }
}*/

class Person2 {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();

        ageMap.put("홍길동", 20);
        ageMap.put("한석봉", 25);

        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            String name = entry.getKey();
            Integer age = entry.getValue();
            System.out.println(name + "의 나이는 " + age + "살");
        }
    }
}


