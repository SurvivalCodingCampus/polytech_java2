package com.survivalcoding.day260615;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private static final String FIRST_PERSON_NAME = "홍길동";
    private static final String SECOND_PERSON_NAME = "한석봉";
    private static final String SHORT_NAME = "김";
    private static final String NULL_NAME = null;

    private static final int FIRST_PERSON_AGE = 20;
    private static final int SECOND_PERSON_AGE = 25;
    private static final int INVALID_AGE = -1;
    private static final int EXPECTED_BIRTH_YEAR = LocalDate.now().getYear() - FIRST_PERSON_AGE;

    private static final String FIRST_PERSON_AGE_MESSAGE = "홍길동의 나이는 20살";
    private static final String SECOND_PERSON_AGE_MESSAGE = "한석봉의 나이는 25살";

    @Test
    @DisplayName("Person 생성자는 이름을 설정한다")
    void constructorSetsName() {
        Person person = new Person(FIRST_PERSON_NAME);

        assertEquals(FIRST_PERSON_NAME, person.getName());
    }

    @Test
    @DisplayName("Person 생성자는 이름이 null이면 예외를 발생시킨다")
    void constructorThrowsExceptionWhenNameIsNull() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Person(NULL_NAME)
        );
    }

    @Test
    @DisplayName("Person 생성자는 이름이 2문자 미만이면 예외를 발생시킨다")
    void constructorThrowsExceptionWhenNameIsTooShort() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Person(SHORT_NAME)
        );
    }

    @Test
    @DisplayName("setAge는 나이를 설정한다")
    void setAgeSetsAge() {
        Person person = new Person(FIRST_PERSON_NAME);

        person.setAge(FIRST_PERSON_AGE);

        assertEquals(FIRST_PERSON_AGE, person.getAge());
    }

    @Test
    @DisplayName("setAge는 나이가 음수이면 예외를 발생시킨다")
    void setAgeThrowsExceptionWhenAgeIsNegative() {
        Person person = new Person(FIRST_PERSON_NAME);

        assertThrows(
                IllegalArgumentException.class,
                () -> person.setAge(INVALID_AGE)
        );
    }

    @Test
    @DisplayName("setAge는 출생연도를 계산한다")
    void setAgeCalculatesBirthYear() {
        Person person = new Person(FIRST_PERSON_NAME);

        person.setAge(FIRST_PERSON_AGE);

        assertEquals(EXPECTED_BIRTH_YEAR, person.getBirthYear());
    }

    @Test
    @DisplayName("연습문제 2: Person 인스턴스를 List에 담고 이름을 확인한다")
    void exercise2StoresPeopleInListAndReadsNames() {
        List<Person> people = new ArrayList<>();

        people.add(new Person(FIRST_PERSON_NAME));
        people.add(new Person(SECOND_PERSON_NAME));

        List<String> names = new ArrayList<>();
        for (Person person : people) {
            names.add(person.getName());
        }

        assertEquals(List.of(FIRST_PERSON_NAME, SECOND_PERSON_NAME), names);
    }

    @Test
    @DisplayName("연습문제 3: 이름과 나이를 Map에 담고 출력 문장을 확인한다")
    void exercise3StoresNameAndAgeInMapAndBuildsMessages() {
        Map<String, Integer> ages = new LinkedHashMap<>();

        ages.put(FIRST_PERSON_NAME, FIRST_PERSON_AGE);
        ages.put(SECOND_PERSON_NAME, SECOND_PERSON_AGE);

        List<String> messages = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            messages.add(entry.getKey() + "의 나이는 " + entry.getValue() + "살");
        }

        assertEquals(List.of(FIRST_PERSON_AGE_MESSAGE, SECOND_PERSON_AGE_MESSAGE), messages);
    }
}
