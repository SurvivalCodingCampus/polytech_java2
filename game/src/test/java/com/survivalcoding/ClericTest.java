package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClericTest {

    @Test
    @DisplayName("selfAid 테스트, MP 5 소모 후 HP 회복")
    void selfAid() {
        // given 준비
        Cleric test1 = new Cleric();
        // 초기값 준비
        test1.hp = 10;
        test1.mp = 10;

        // when 실행
        test1.selfAid();

        // then 검증
        assertEquals(5, test1.mp);
        assertEquals(50, test1.hp);
    }

    @Test
    @DisplayName("pray N초 후 N + (0 ~ 2) 만큼 MP 회복")
    void pray() {
        //given 준비
        Cleric test2 = new Cleric();
        int tmp;    // 관측용 변수 생성

        // 초기값
        test2.mp = 5;

        // when 실행
        tmp = test2.pray(0);

        // then 검증
        // 피드백 이후 assert 관련 함수들을 찾아서 랜덤값 작동 확인 방법 개선
        // pray(int second)는 second + (0 ~ 2) 이기 때문에, 회복량은 0 ~ 2 가 되어야 함.
        assertTrue(tmp >= 0 && tmp <= 2);
        System.out.println("회복량 : " + tmp);


        /*
        // 검증시 랜덤으로 인해 assertEquals 사용을 못함
        // 5회 반복하여 실제로 랜덤으로 작동하는지 확인
        System.out.println("회복량 : " + tmp);

        // 아래는 검증 5회 반복임
        for (int i = 0; i < 5; i++) {
            test2.mp = 5;
            tmp = test2.pray(0);
            System.out.println("회복량 : " + tmp);
        }

        */
        // 초기값 9로 maxMP를 넘기는 상황을 연축
        test2.mp = 9;

        // when 실행
        // 무조건 maxMP를 넘기므로 1이 출력되도록 실행
        tmp = test2.pray(3);

        // then 검증
        // maxMP의 값이 10이기에 로직상 tmp는 1이 담겨있어야함.
        System.out.println("회복량 pray(3) = " + tmp);
    }
}