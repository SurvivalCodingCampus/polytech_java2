
package com.survivalcoding;

import java.util.Random;

public class Cleric {
    // 1. 관례에 따른 상수 선언 (static final, 대문자)
    static final int MAX_HP = 50;
    static final int MAX_MP = 10;

    String name;
    // 2. 변수명은 소문자로 시작
    int hp = MAX_HP;
    int mp = MAX_MP;

    // 셀프 에이드: 마나를 5 소비하여 체력을 최대로 회복
    void selfAid() {
        if (mp >= 5) {
            mp -= 5;
            hp = MAX_HP;
        } else {
            System.out.println("MP가 부족하여 스킬을 사용할 수 없습니다.");
        }
    }

    // 기도하기: MP 회복
    int pray(int prayTime) {
        Random random = new Random();

        // 이론상의 회복량 계산
        int addMp = random.nextInt(3) * prayTime;

        // 3. 실제 회복량 조정 (최대 MP를 넘지 않도록 Math.min 활용)
        int actualRecover = Math.min(addMp, MAX_MP - mp);

        // 4. 캐릭터의 실제 MP에 회복량 적용
        mp += actualRecover;

        // 실제 회복된 마나량 반환
        return actualRecover;
    }
}



//package com.survivalcoding;
//
//public class Cleric {
//    final int HP_max = 50;
//    final int MP_max = 10;
//    String name;
//    int HP = 50;
//    int MP = 10;
//
//
//    void selfAid() {
//        MP -= 5;
//        HP = HP_max;
//    }
//    int pray(int praytime) {
//        int addMP;
//        addMP =  random.nextInt(3) * praytime;
//        if (MP + addMP > MP_max){
//            addMP = MP_MAX - MP;
//
//        }
//
//
//        return addMP;
//    }
//
//
//}