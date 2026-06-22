package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    @Test
    void 이름_정상_설정() {
        Person p = new Person("홍길동", 20);
        assertEquals("홍길동", p.getName());
    }

    @Test
    void 나이_정상_설정() {
        Person p = new Person("홍길동", 20);
        assertEquals(20, p.getAge());
    }

}