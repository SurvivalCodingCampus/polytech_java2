package com.survivalcoding;

// 메모리 = 가상적인 공간
// 필드 = 객체가 가지는 속성
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 인스턴스 생성
        Cleric cleric = new Cleric();

        // 생성한 용사에게 최초의 HP를 설정
        cleric.hp = 50;
        cleric.mp = 10;

        System.out.println(cleric.hp);

        int a = 10;
        long l = 10L;
    }
}

// given 준비
// when 실행
// then 검증